public class Orders {
    private static DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[10];
    static int qtyOrdered = 0, NumberOfElement = 0, NoAdd;
    public static float TotalCost = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered > 9) {
            System.out.println("The order is almost full");
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (qtyOrdered > 9) {
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
                    System.out.println("i = " + i + "\t1\tj = " + j);
                    itemsOrdered[i] = dvdList[j];

                }
                qtyOrdered = 10;
            } else {
                NoAdd = 10 - qtyOrdered;
                for (int i = temp, j = 0; i < temp1; i++, j++) {
                    System.out.println("i = " + i + "\t2\tj = " + j);
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
        if (qtyOrdered > 9) {
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
            int temp1 = qtyOrdered + RandomNumber;
            if (temp1 >= 10) {
                NoAdd = 10 - qtyOrdered;
                for (int i = temp, j = 0; i < 10; i++, j++) {
                    System.out.println("i = " + i + "\t1\tj = " + j);
                    itemsOrdered[i] = dvdList[j];

                }
                qtyOrdered = 10;
            } else {
                NoAdd = RandomNumber;
                for (int i = temp, j = 0; i < temp1; i++, j++) {
                    System.out.println("i = " + i + "\t2\tj = " + j);
                    itemsOrdered[i] = dvdList[j];
                    qtyOrdered++;
                }
            }
            System.out.println("No add: " + NoAdd);
            System.out.println("Number of element: " + NumberOfElement);
            System.out.println("qtyOrdered: " + qtyOrdered);
            System.out.println("Random Number: " + RandomNumber);

        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered > 9) {
            System.out.println("The order is almost full");
            TotalCost = 0;
            System.out.printf("%30s\n", "Cac phan tu khong duoc them");
            System.out.printf("%-30s%-20s%-20s%-10s%-10s\n",
                    "Title", "Category", "Director", "Length", "Cost");
            
            System.out.printf("%-30s%-20s%-20s%-10d%-10.2f\n",
                    dvd1.getTitle(), dvd1.getCategory(),
                    dvd1.getDirector(), dvd1.getLength(),
                    dvd1.getCost());
            System.out.printf("%-30s%-20s%-20s%-10d%-10.2f\n",
                    dvd2.getTitle(), dvd2.getCategory(),
                    dvd2.getDirector(), dvd2.getLength(),
                    dvd2.getCost());
            TotalCost = dvd1.getCost() + dvd2.getCost();
            System.out.println("Total cost: " + TotalCost);
        } else if (qtyOrdered == 9) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The order is almost full");
            TotalCost = 0;
            System.out.printf("%30s\n", "Cac phan tu khong duoc them");
            System.out.printf("%-30s%-20s%-20s%-10s%-10s\n",
                    "Title", "Category", "Director", "Length", "Cost");

            System.out.printf("%-30s%-20s%-20s%-10d%-10.2f\n",
                    dvd1.getTitle(), dvd1.getCategory(),
                    dvd1.getDirector(), dvd1.getLength(),
                    dvd1.getCost());
            TotalCost = dvd1.getCost();
            System.out.println("Total cost: " + TotalCost);
        } else if (qtyOrdered < 9) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if ((disc.getTitle().compareTo(itemsOrdered[i].getTitle())) == 0) {
                itemsOrdered[i] = itemsOrdered[qtyOrdered - 1];
                qtyOrdered--;
            }
        }
    }

    public void HienThi() {
        TotalCost = 0;
        System.out.printf("%30s\n", "itemsOrdered[]");
        System.out.printf("%-30s%-20s%-20s%-10s%-10s\n",
                "Title", "Category", "Director", "Length", "Cost");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.printf("%-30s%-20s%-20s%-10d%-10.2f\n",
                    itemsOrdered[i].getTitle(), itemsOrdered[i].getCategory(),
                    itemsOrdered[i].getDirector(), itemsOrdered[i].getLength(),
                    itemsOrdered[i].getCost());
            TotalCost = TotalCost + itemsOrdered[i].getCost();

        }
        System.out.println("Total cost: " + TotalCost);
    }
    
    public void HienThi1(DigitalVideoDisc[] dvdList) {
        TotalCost = 0;
        System.out.printf("%30s\n", "dvdList[]");
        System.out.printf("%-30s%-20s%-20s%-10s%-10s\n",
                "Title", "Category", "Director", "Length", "Cost");
        for (int i = 0; i < NumberOfElement; i++) {
            System.out.printf("%-30s%-20s%-20s%-10d%-10.2f\n",
                    dvdList[i].getTitle(),dvdList[i].getCategory(),
                    dvdList[i].getDirector(), dvdList[i].getLength(),
                    dvdList[i].getCost());

            TotalCost = TotalCost + dvdList[i].getCost();
        }
        System.out.println("Total cost: " + TotalCost);
        if ((NoAdd != 0) && (NoAdd < NumberOfElement)) {
            TotalCost = 0;
            System.out.printf("%30s\n", "Cac phan tu khong duoc them");
            System.out.printf("%-30s%-20s%-20s%-10s%-10s\n",
                    "Title", "Category", "Director", "Length", "Cost");
            for (int i = NoAdd; i < NumberOfElement; i++) {
                System.out.printf("%-30s%-20s%-20s%-10d%-10.2f\n",
                        dvdList[i].getTitle(), dvdList[i].getCategory(),
                        dvdList[i].getDirector(), dvdList[i].getLength(),
                        dvdList[i].getCost());
                TotalCost = TotalCost + dvdList[i].getCost();

            }
            System.out.println("Total cost: " + TotalCost);
        }
    }
}
