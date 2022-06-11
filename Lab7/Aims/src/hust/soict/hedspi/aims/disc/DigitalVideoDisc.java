package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.interfaces.Playable;

public class DigitalVideoDisc extends Disc implements Playable{

	public DigitalVideoDisc(String titleString, String categoryString, float cost, int id, String director, int length) {
		super(titleString, categoryString, cost, id, length);
	}
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitleString());
		System.out.println("DVD length: " + this.getLength());
	}
}


