package hust.soict.hedspi.aims.track;

import hust.soict.hedspi.aims.interfaces.Playable;

public class Track implements Playable{
	
	private String titleString;
	private int length;

	public String getTitleString() {
		return titleString;
	}

	public int getLength() {
		return length;
	}

	public Track() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitleString());
		System.out.println("DVD length: " + this.getLength());
	}
}






