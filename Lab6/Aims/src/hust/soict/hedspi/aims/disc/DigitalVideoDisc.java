package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.media.Media;

public class DigitalVideoDisc extends Media{
	private String director;
	private int length;

	public DigitalVideoDisc(String title) {
		super();
		this.setTitleString(title);
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean search(String titleString) {
		String splitTitleString = this.getTitleString().toLowerCase();
		String splitTitleString1 = titleString.toLowerCase();
		String[] arrOfTitleStrings = splitTitleString1.split(" ");
		int count = 0;
		for (String a : arrOfTitleStrings) {
			//System.out.println(a);
			if (splitTitleString.contains(a)) {
				count++;
			}
		}
		if (count != 0) {
			return true;
		} else {
			return false;
		}
	}
}
