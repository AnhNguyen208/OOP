package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.hedspi.aims.book.Book;
import hust.soict.hedspi.aims.disc.CompactDisc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.track.Track;

public class Aims {
	public static void main(String[] args) {
		List<Order> newOrders = new ArrayList<Order>();
		int currentOrder = 0;
		int currentItem = 0;
		int temp1 = 0;
		Order addOrder = new Order(currentOrder);
		while (true) {
			@SuppressWarnings("resource")
			Scanner myObjectScanner = new Scanner(System.in);
			showMenu();
			String c;
			int menu = Integer.parseInt(myObjectScanner.nextLine());
			if (menu == 1) {
				currentOrder++;
				addOrder = new Order(currentOrder);
				temp1 = 1;
				currentItem = 0;
			} else if (menu == 2) {
				if (currentOrder == 0) {
					System.out.println("Select menu 1 before executing menu 2!!!!!");
					continue;
				}
				System.out.println("Input type(Book, CompactDiscor DigitalVideoDisc): ");
				c = myObjectScanner.nextLine();
				System.out.println("Input title: ");
				String titleString = myObjectScanner.nextLine();
				System.out.println("Input category: ");
				String categoryString = myObjectScanner.nextLine();
				System.out.println("Input cost: ");
				float cost = Float.parseFloat(myObjectScanner.nextLine());
				
				if(c.contains("book")) {
					addOrder.addMedia(inputBook(currentItem, titleString, categoryString, cost));
				} else if (c.contains("cd")) {
					addOrder.addMedia(inputCD(currentItem, titleString, categoryString, cost));
				} else if (c.contains("dvd")) {
					System.out.println("Input director: ");
					String directorString = myObjectScanner.nextLine();
					addOrder.addMedia(inputDVD(currentItem, titleString, categoryString, cost, directorString));
				}
				currentItem++;
				if (temp1 == 1) {
					newOrders.add(addOrder);
					temp1 = 0;
				}
			} else if (menu == 3) {
				if (currentOrder == 0) {
					System.out.println("Select menu 1 before executing menu 3!!!!!");
					continue;
				}
				System.out.println("Please choose a id(1->" + currentItem +
						") from Order list" + addOrder.getId() + ":");
				int item = Integer.parseInt(myObjectScanner.nextLine());
				addOrder.removeMedia(item);
			} else if (menu == 4) {
				if (currentOrder == 0) {
					System.out.println("Select menu 1 before executing menu 4!!!!!");
					continue;
				}
				int id = 0;
				for (Order testOrder : newOrders) {
					if (id != testOrder.getId()) {
						System.out.println("Order list " + testOrder.getId());
						id = testOrder.getId();
					}
					testOrder.orderList();
				}
			} else if (menu == 5) {
				if (currentOrder == 0) {
					System.out.println("Select menu 1 before executing menu 3!!!!!");
					continue;
				}
				System.out.println("Please choose a id(1->" + currentItem +
						") from Order list" + addOrder.getId() + ":");
				int item = Integer.parseInt(myObjectScanner.nextLine());
				addOrder.orderPlay(item);
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
		System.out.println("5. Play the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: ");
	}
	
	public static Book inputBook(int id, String titleString, String categoryString, float cost) {
		@SuppressWarnings("resource")
		Scanner myObjectScanner = new Scanner(System.in);
		List<String> authorStrings = new ArrayList<String>();
		System.out.println("Input number author: ");
		int number = Integer.parseInt(myObjectScanner.nextLine());
		String authorString;
		for(int i = 0; i < number; i++) {
			System.out.printf("Input author %d: ", i+1);
			authorString = myObjectScanner.nextLine();
			authorStrings.add(authorString);
		}
		return new Book(titleString, categoryString, cost, id, authorStrings);
	}
	
	public static CompactDisc inputCD(int id, String titleString, String categoryString, float cost) {
		@SuppressWarnings("resource")
		Scanner myObjectScanner = new Scanner(System.in);
		System.out.println("Input artist: ");
		String artistString = myObjectScanner.nextLine();
		List<Track> tracks = new ArrayList<Track>();
		System.out.println("Input number track: ");
		int number = Integer.parseInt(myObjectScanner.nextLine());
		String titleTrackString;
		int length;
		int totalLenth = 0;
		for(int i = 0; i < number; i++) {
			System.out.printf("Input track %d: ", i+1);
			System.out.println("Input title track : ");
			titleTrackString = myObjectScanner.nextLine();
			System.out.println("Input length track : ");
			length = Integer.parseInt(myObjectScanner.nextLine());
			totalLenth = totalLenth + length;
			tracks.add(new Track(titleTrackString, length));
		}
		return new CompactDisc(titleString, categoryString, cost, id, artistString, tracks, totalLenth);
	}
	
	public static DigitalVideoDisc inputDVD(int id, String titleString, String categoryString, float cost, 
			String directorString) {
		@SuppressWarnings("resource")
		Scanner myObjectScanner = new Scanner(System.in);
		System.out.println("Input length DVD: ");
		int length = Integer.parseInt(myObjectScanner.nextLine());
		return new DigitalVideoDisc(titleString, categoryString, cost, id, directorString, length);
	}
	
}







