package hust.soict.hedspi.aims.order;

import java.util.ArrayList;

import hust.soict.hedspi.aims.book.Book;
import hust.soict.hedspi.aims.disc.CompactDisc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class Order{
	static int qtyOrdered = 0;
	public static float TotalCost;
	private ArrayList<Media> itemOrderedArrayList = new ArrayList<Media>();
	private int id;
	
	public Order(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void addMedia(Media media) {
		System.out.println("Add media");
		itemOrderedArrayList.add(media);
	}

	public void removeMedia(int deleteNumber) {
		if(itemOrderedArrayList.get(deleteNumber-1) == null) {
			
		}
		System.out.println("Remove media");
		itemOrderedArrayList.remove(deleteNumber - 1);
	}

	public void totalCost() {
		TotalCost = 0;
		for (Media media : itemOrderedArrayList) {
			TotalCost += media.getCost();
		}
		System.out.printf("Total cost: %5.2f$\n", TotalCost);
	}

	public void orderList() {	
		for (Media media : itemOrderedArrayList) {
			String cString = null;
			if(media.getClass().toString().contains("Book")) {
				cString = "Book";
			} else if(media.getClass().toString().contains("CompactDisc")) {
				cString = "Compact Disc";
			} else if(media.getClass().toString().contains("DigitalVideoDisc")) {
				cString = "Digital Video Disc";
			}
			System.out.printf("%d: %-20s-%s-%s-%-5.2f$\n", media.getId()+1, cString,  media.getTitleString(), 
					media.getCategoryString(), media.getCost());
		}
		totalCost();
	}
	
	public void orderPlay(int number) {
		Media media = itemOrderedArrayList.get(number-1);
		if(media.getClass().toString().contains("Book")) {
			Book book = (Book) media;
			book.play();
		} else if(media.getClass().toString().contains("CompactDisc")) {
			CompactDisc compactDisc = (CompactDisc) media;
			compactDisc.play();
		} else if(media.getClass().toString().contains("DigitalVideoDisc")) {
			DigitalVideoDisc digitalVideoDisc = (DigitalVideoDisc) media;
			digitalVideoDisc.play();
		}
	}
}
