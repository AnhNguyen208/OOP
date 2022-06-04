package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
	public static void main(String[] args) {
		List<Order> newOrders = new ArrayList<Order>();
		int currentOrder = 0;
		int currentDVD = 0;
		int temp1 = 0;
		Order addOrder = new Order(currentOrder);
		while (true) {
			Scanner myObjectScanner = new Scanner(System.in);
			showMenu();
			int menu = myObjectScanner.nextInt();
			String c = myObjectScanner.nextLine();
			if (menu == 1) {
				currentOrder++;
				addOrder = new Order(currentOrder);
				temp1 = 1;
				currentDVD = 0;
			} else if (menu == 2) {
				if (currentOrder == 0) {
					System.out.println("Chon menu 1 truoc khi thuc hien!!!!!");
					continue;
				}
				System.out.println("Number of DVD: ");
				int number = myObjectScanner.nextInt();
				c = myObjectScanner.nextLine();
				for (int i = 0; i < number; i++) {
					System.out.println("Input title: ");
					c = myObjectScanner.nextLine();
					DigitalVideoDisc newDigitalVideoDisc = new DigitalVideoDisc(c);
					System.out.println("Input category: ");
					c = myObjectScanner.nextLine();
					newDigitalVideoDisc.setCategoryString(c);
					System.out.println("Input cost: ");
					float cost = myObjectScanner.nextFloat();
					c = myObjectScanner.nextLine();
					newDigitalVideoDisc.setCost(cost);
					newDigitalVideoDisc.setId(currentDVD++);
					addOrder.addMedia(newDigitalVideoDisc);
				}
				if (temp1 == 1) {
					newOrders.add(addOrder);
					temp1 = 0;
				}
			} else if (menu == 3) {
				if (currentOrder == 0) {
					System.out.println("Chon menu 1 truoc khi thuc hien!!!!!");
					continue;
				}
				System.out.println("Please choose a id(1->" + currentDVD +
						") from Order list" + addOrder.getId() + ":");
				int item = myObjectScanner.nextInt();
				c = myObjectScanner.nextLine();
				addOrder.removeMedia(item);
			} else if (menu == 4) {
				if (currentOrder == 0) {
					System.out.println("Chon menu 1 truoc khi thuc hien!!!!!");
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