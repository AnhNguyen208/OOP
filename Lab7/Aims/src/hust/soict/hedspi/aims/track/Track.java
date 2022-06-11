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

	public Track(String titleString,int length) {
		this.titleString = titleString;
		this.length = length;
	}

	@Override
	public void play() {
		System.out.println("Playing track: " + this.getTitleString());
		System.out.println("Track length: " + this.getLength());
	}
}






