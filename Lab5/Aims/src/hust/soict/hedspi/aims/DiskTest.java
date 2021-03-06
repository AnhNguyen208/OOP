package hust.soict.hedspi.aims;

import java.util.Scanner;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {
	public static void main(String[] args) {
    	Order anorder = new Order();
    	
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        
        String titleString;
        try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Enter input");
			titleString = myObj.nextLine(); 
		}
        System.out.println(dvd1.search(titleString.toString()));
        
        anorder.addDigitalVideoDisc(dvd1);
        anorder.addDigitalVideoDisc(dvd2);
        anorder.addDigitalVideoDisc(dvd3);
        anorder.HienThi(0);
        anorder.getALuckyItem();
        System.exit(0);
    }
}
