package hust.soict.hedspi.aims;

import java.util.Scanner;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
	public static void main(String[] args) {
		Order newOrder = new Order();
		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategoryString("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategoryString("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategoryString("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);

		while (true) {
			Scanner myObjectScanner = new Scanner(System.in);
			showMenu();
			int menu = myObjectScanner.nextInt();
			String c = myObjectScanner.nextLine();
			if (menu == 1) {

			} else if (menu == 2) {

				System.out.println("Please choose a dvd(dvd1, dvd2, dvd3): ");
				String item = myObjectScanner.nextLine();
				c = myObjectScanner.nextLine();
				if (item.equals("dvd1")) {
					newOrder.addMedia(dvd1);
				} else if (item.equals("dvd2")) {
					newOrder.addMedia(dvd2);
				} else if (item.equals("dvd3")) {
					newOrder.addMedia(dvd3);
				}

			} else if (menu == 3) {

				System.out.println("Please choose a id: ");
				int item = myObjectScanner.nextInt();
				c = myObjectScanner.nextLine();
				newOrder.removeMedia(item);

			} else if (menu == 4) {
				newOrder.orderList();
			} else if (menu == 0) {
				System.exit(0);
			}
		}
	}

	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: ");
	}
}