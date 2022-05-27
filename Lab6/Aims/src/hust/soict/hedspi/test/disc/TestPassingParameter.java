package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD =  new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title:" + jungleDVD.getTitleString());
        System.out.println("cinderella dvd title:" + cinderellaDVD.getTitleString());
        // changeTitle(jungleDVD, cinderellaDVD.getTitle());
        // System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap (DigitalVideoDisc o1, DigitalVideoDisc o2) {
        DigitalVideoDisc tmp = new DigitalVideoDisc("");
        tmp.setTitleString(o1.getTitleString());
        o1.setTitleString(o2.getTitleString());
        o2.setTitleString(tmp.getTitleString());
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitleString();
        dvd.setTitleString(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
