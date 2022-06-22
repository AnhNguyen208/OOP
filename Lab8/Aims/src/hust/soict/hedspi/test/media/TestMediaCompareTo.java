package hust.soict.hedspi.test.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestMediaCompareTo {

	public static void main(String[] args) {
		List<DigitalVideoDisc> collection = new ArrayList<DigitalVideoDisc>();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95f, 1, "Roger Allers", 87);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f, 2, "George Lucas", 124);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f, 3, "John Musker", 90);
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(dvd3);

		Iterator<DigitalVideoDisc> iterator = collection.iterator();
		System.out.println("-----------------------------");
		System.out.println("The DVDs currently in the order are:");
		DigitalVideoDisc nowDigitalVideoDisc = null;
		while (iterator.hasNext()) {
			nowDigitalVideoDisc = (DigitalVideoDisc) iterator.next();
			System.out.println(nowDigitalVideoDisc.getTitleString() + ": " + nowDigitalVideoDisc.getCost());

		}
		Collections.sort((List<DigitalVideoDisc>) collection);
		System.out.println("-----------------------------");
		System.out.println("The DVDs sorted order are:");

		iterator = collection.iterator();
		while (iterator.hasNext()) {
			nowDigitalVideoDisc = (DigitalVideoDisc) iterator.next();
			System.out.println(nowDigitalVideoDisc.getTitleString() + ": " + nowDigitalVideoDisc.getCost());

		}
		System.out.println("-----------------------------");

	}

}
