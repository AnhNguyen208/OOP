package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
	private String title, category, director;
	private int length;
	private float cost;

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public boolean search(String titleString) {
		String splitTitleString = title.toLowerCase();
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
