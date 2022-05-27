package hust.soict.hedspi.aims.order;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Media;

public class Order {
    static int qtyOrdered = 0;
    public static float TotalCost;
    private ArrayList<Media> itemOrderedArrayList = new ArrayList<Media>(); 
    
    public void addMedia(Media media) {
    	System.out.println("Add media");
		itemOrderedArrayList.add(media);
	}
    
    public void removeMedia(int deleteNumber) {
    	System.out.println("Remove media");
    	itemOrderedArrayList.remove(deleteNumber-1);
	}
    
    public void totalCost() {
    	TotalCost = 0;
		for(Media media:itemOrderedArrayList) {
			TotalCost += media.getCost();
		}
		System.out.printf("Total cost: %5.2f$\n", TotalCost);
	}
    
    public void orderList() {
    	System.out.println("Order list");
    	for(Media media: itemOrderedArrayList) {
    		System.out.printf("DVD: %s-%s-%-5.2f$\n",
                    media.getTitleString(), media.getCategoryString(),
                    media.getCost());
    	}
    	totalCost();
	}
}

