import java.util.*;

public class Aims {
    public static void main(String[] args) {
        Orders anorder = new Orders();
        Random generator = new Random();
        Random generator1 = new Random();
        DigitalVideoDisc dvdList[] = new DigitalVideoDisc[100];
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
        // add the dvd to the order
        anorder.addDigitalVideoDisc(dvd2);
        // add the dvd to the order
        anorder.addDigitalVideoDisc(dvd3);
        /*// anorder.HienThi();
        System.out.println("Total Cost : " + anorder.TotalCost);
        anorder.removeDigitalVideoDisc(dvd2);
        System.out.println("After remove dvd2");
        // anorder.HienThi();
        System.out.println("Total Cost : " + anorder.TotalCost);
        anorder.addDigitalVideoDisc(dvd1);
        anorder.addDigitalVideoDisc(dvd2);
        // anorder.HienThi();
        System.out.println("Total Cost : " + anorder.TotalCost);*/
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
        System.out.println("Total length: " + temp);
        if (temp != 0) {
            anorder.addDigitalVideoDisc(dvdList, generator.nextInt(temp));
            anorder.HienThi1(dvdList);
        }
        anorder.addDigitalVideoDisc(dvd1, dvd2);
        anorder.HienThi();
        System.exit(0);
    }

    
}
