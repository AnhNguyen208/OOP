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
	
	@Override 
	public int compareTo(Object o) {
		if((o instanceof DigitalVideoDisc) == false)
		{
			return -1;
		}
		if(this.getTitleString().compareTo(((DigitalVideoDisc) o).getTitleString()) == 0) {
			return 0;
		}
		else if (this.getTitleString().compareTo(((DigitalVideoDisc) o).getTitleString()) > 0) {
			return 1;
		}
		return -1;
	}
}







