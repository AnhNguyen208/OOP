package hust.soict.hedspi.aims.order;

import java.util.Random;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Order {
    private static DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[10];
    static int qtyOrdered = 0, NumberOfElement = 0, NoAdd;
    public static float TotalCost = 0;
    private String dateOrdered;
    public static final int MAX_LIMITED_ORDERS = 5;
    private static int nbOrders = 0;
   

    public String getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(String dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if ((qtyOrdered > 9) || (nbOrders >= MAX_LIMITED_ORDERS)) {
            System.out.println("The order is almost full");
        } else {
            dateOrdered = java.time.LocalDate.now().toString();
            itemsOrdered[qtyOrdered] = disc;
            nbOrders++;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if ((qtyOrdered > 9) || (nbOrders > 4)) {
            System.out.println("The order is almost full");
            NoAdd = 0;
        } else {
            for (int i = 0; i < dvdList.length; i++) {
                if (dvdList[i] != null) {
                    NumberOfElement++;
                } else {
                    break;
                }
            }
            int temp = qtyOrdered;
            int temp1 = qtyOrdered + NumberOfElement;
            if (temp1 >= 10) {
                NoAdd = 10 - qtyOrdered;
                for (int i = temp, j = 0; i < 10; i++, j++) {
                    // System.out.println("i = " + i + "\t1\tj = " + j);
                    itemsOrdered[i] = dvdList[j];
                }
                qtyOrdered = 10;
            } else {
                NoAdd = 10 - qtyOrdered;
                for (int i = temp, j = 0; i < temp1; i++, j++) {
                    // System.out.println("i = " + i + "\t2\tj = " + j);
                    itemsOrdered[i] = dvdList[j];
                    qtyOrdered++;
                }
            }
            System.out.println("No add: " + NoAdd);
            System.out.println("Number of element: " + NumberOfElement);
            System.out.println("qtyOrdered: " + qtyOrdered);

        }
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList, int RandomNumber) {
        if ((qtyOrdered > 9) || (nbOrders >= MAX_LIMITED_ORDERS)) {
            System.out.println("The order is almost full");
            NoAdd = 0;
        } else {
            dateOrdered = java.time.LocalDate.now().toString();
            int temp = qtyOrdered;
            int temp1 = qtyOrdered + RandomNumber;
            if (temp1 >= 10) {
                NoAdd = 10 - qtyOrdered;
                for (int i = temp, j = 0; i < 10; i++, j++) {
                    // System.out.println("i = " + i + "\t1\tj = " + j);
                    itemsOrdered[i] = dvdList[j];
                }
                qtyOrdered = 10;
            } else {
                NoAdd = RandomNumber;
                for (int i = temp, j = 0; i < temp1; i++, j++) {
                    // System.out.println("i = " + i + "\t2\tj = " + j);
                    itemsOrdered[i] = dvdList[j];
                    qtyOrdered++;
                }
            }
            System.out.println("The discList has been added");
            nbOrders++;
        }
       
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered > 9) {
            System.out.println("The order is almost full");
            TotalCost = 0;
            System.out.printf("%30s\n", "Cac phan tu khong duoc them");
            System.out.printf("%-30s%-20s%-20s%-10s%-10s\n",
                    "Title", "Category", "Director", "Length", "Cost");
            printElenment(dvd1);
            printElenment(dvd2);
            TotalCost = dvd1.getCost() + dvd2.getCost();
            System.out.printf("Total cost: %.2f\n", TotalCost);
        } else if (qtyOrdered == 9) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The order is almost full");
            TotalCost = 0;
            System.out.printf("%30s\n", "Cac phan tu khong duoc them");
            System.out.printf("%-30s%-20s%-20s%-10s%-10s\n",
                    "Title", "Category", "Director", "Length", "Cost");
            printElenment(dvd2);
            TotalCost = dvd2.getCost();
            System.out.printf("Total cost: %.2f\n", TotalCost);
        } else if (qtyOrdered < 9) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
        }
    }

    public void printElenment(DigitalVideoDisc element) {
        System.out.printf("DVD: %s-%s-%s-%d-%-3.2f$\n",
                element.getTitle(), element.getCategory(),
                element.getDirector(), element.getLength(),
                element.getCost());
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if ((disc.getTitle().compareTo(itemsOrdered[i].getTitle())) == 0) {
                itemsOrdered[i] = itemsOrdered[qtyOrdered - 1];
                qtyOrdered--;
            }
        }
    }

    public int HienThi(int number) {
        if ((qtyOrdered > 9) || (nbOrders >= MAX_LIMITED_ORDERS)) {
            TotalCost = 0;
            if (qtyOrdered >= 10) {
                qtyOrdered = 10;
            }
            System.out.printf("%50s\n", "Order");
            System.out.println(dateOrdered);
            for (int i = number, j = 1; i < qtyOrdered; i++, j++) {
                System.out.printf("%d. ", j);
                printElenment(itemsOrdered[i]);
                TotalCost = TotalCost + itemsOrdered[i].getCost();
            }
            System.out.printf("Total cost: %.2f\n", TotalCost);
            System.out.println("FULL ORDERS");
            nbOrders = 6;
            return 10;
        } else {
            TotalCost = 0;
            System.out.printf("%50s\n", "Order");
            System.out.println(dateOrdered);
            for (int i = number, j = 1; i < qtyOrdered; i++, j++) {
                System.out.printf("%d. ", j);
                printElenment(itemsOrdered[i]);
                TotalCost = TotalCost + itemsOrdered[i].getCost();
            }
            System.out.printf("Total cost: %.2f\n", TotalCost);
            return qtyOrdered;
        }
        
    }
    
    public void HienThi1(DigitalVideoDisc[] dvdList) {
        
        TotalCost = 0;
        System.out.printf("%30s\n", "dvdList[]");
        System.out.printf("%-30s%-20s%-20s%-10s%-10s\n",
                "Title", "Category", "Director", "Length", "Cost");
        for (int i = 0; i < NumberOfElement; i++) {
            printElenment(dvdList[i]);

            TotalCost = TotalCost + dvdList[i].getCost();
        }
        System.out.printf("Total cost: %.2f\n", TotalCost);
        if ((NoAdd != 0) && (NoAdd < NumberOfElement)) {
            TotalCost = 0;
            System.out.printf("%30s\n", "Cac phan tu khong duoc them");
            System.out.printf("%-30s%-20s%-20s%-10s%-10s\n",
                    "Title", "Category", "Director", "Length", "Cost");
            for (int i = NoAdd; i < NumberOfElement; i++) {
                printElenment(dvdList[i]);
                TotalCost = TotalCost + dvdList[i].getCost();

            }
            System.out.printf("Total cost: %.2f\n", TotalCost);
        }
    }
    
    public void getALuckyItem() {
    	Random generator = new Random();
    	int temp1 = generator.nextInt(qtyOrdered);
    	itemsOrdered[temp1].setCost(0);
    	TotalCost = 0;
    	System.out.println("Lucky item: " + itemsOrdered[temp1].getTitle());
        System.out.printf("%50s\n", "Order");
        System.out.println(dateOrdered);
        for (int i = 0, j = 1; i < qtyOrdered; i++, j++) {
            System.out.printf("%d. ", j);
            printElenment(itemsOrdered[i]);
            TotalCost = TotalCost + itemsOrdered[i].getCost();
        }
        System.out.printf("Total cost: %.2f\n", TotalCost);
	}
}
