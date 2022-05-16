package hust.soict.hedspi.aims;

import java.util.*;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
    public static void main(String[] args) {
        int currentOrder = 0;
        Order anorder = new Order();
        Random generator = new Random();
        Random generator1 = new Random();
        DigitalVideoDisc dvdList[] = new DigitalVideoDisc[20];
        // Create a new dvd object and set the fields
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

        // add the dvd to the order
        anorder.addDigitalVideoDisc(dvd1);
        currentOrder = anorder.HienThi(currentOrder);
        // add the dvd to the order
        anorder.addDigitalVideoDisc(dvd2);
        currentOrder = anorder.HienThi(currentOrder);
        // add the dvd to the order
        anorder.addDigitalVideoDisc(dvd3);
        currentOrder = anorder.HienThi(currentOrder);
        // anorder.HienThi();

        int temp = 0;
        int temp1 = generator.nextInt(10);
        for (int i = 0; i < temp1; i++) {
            int temp2 = generator1.nextInt(3);
            if (temp2 == 0) {
                dvdList[i] = dvd1;
            } else if (temp2 == 1) {
                dvdList[i] = dvd2;
            } else if (temp2 == 2) {
                dvdList[i] = dvd1;
            }
            temp++;
        }
        anorder.addDigitalVideoDisc(dvdList, temp);
        currentOrder = anorder.HienThi(currentOrder);
        anorder.addDigitalVideoDisc(dvdList, temp);
        currentOrder = anorder.HienThi(currentOrder);
        // anorder.addDigitalVideoDisc(dvd1, dvd2);
        System.exit(0);
    }


}