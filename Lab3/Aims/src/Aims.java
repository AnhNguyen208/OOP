public class Aims {
    public static void main(String[] args) {
        Orders anorder = new Orders();
        // Create a new dvd object and set the fields
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        // add the dvd to the order
        anorder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        anorder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        // add the dvd to the order
        anorder.addDigitalVideoDisc(dvd3);
        anorder.HienThi();
        anorder.removeDigitalVideoDisc(dvd2);
        System.out.println("After remove dvd2");
        anorder.HienThi();
        System.exit(0);
    }
}
