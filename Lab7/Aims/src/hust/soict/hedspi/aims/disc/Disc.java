package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.media.Media;

public class Disc extends Media {

	private String director;
	private int length;

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public Disc(String titleString, String categoryString, float cost, int id) {
		super(titleString, categoryString, cost, id);
	}
}


