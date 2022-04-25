public class Orders {
    private static DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[10];
    static int qtyOrdered = 0;
    public static float TotalCost = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= 10) {
            System.out.println("The order is almost full");
        } else {
            itemsOrdered[qtyOrdered] = disc;
            TotalCost = totalCost(disc.getCost());
            qtyOrdered++;
            System.out.println("The disc has been added");
        }

    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if ((disc.getTitle().compareTo(itemsOrdered[i].getTitle())) == 0) {
                itemsOrdered[i] = itemsOrdered[qtyOrdered - 1];
                qtyOrdered--;
                totalCost(0 - disc.getCost());
            }
        }
    }

    public static float totalCost(float f) {
        TotalCost = TotalCost + f;
        return TotalCost;
    }

    public void HienThi() {
        // System.out.printf("%-30s%-20s%-20s%-10s%-10s\n",
        // "Title", "Category", "Director", "Length", "Cost");
        // for(int i = 0; i < qtyOrdered; i++) {
        // System.out.printf("%-30s%-20s%-20s%-10d%-10.2f\n",
        // itemsOrdered[i].getTitle(), itemsOrdered[i].getCategory(),
        // itemsOrdered[i].getDirector(), itemsOrdered[i].getLength(),
        // itemsOrdered[i].getCost());
        // }
        System.out.println("Total cost: " + TotalCost);
    }
}
