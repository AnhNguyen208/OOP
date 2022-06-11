package hust.soict.hedspi.aims.media;

public abstract class Media {

	private String titleString;
	private String categoryString;
	private float cost;
	private int id;

	public int getId() {
		return id;
	}

	public String getTitleString() {
		return titleString;
	}

	public String getCategoryString() {
		return categoryString;
	}

	public float getCost() {
		return cost;
	}

	public Media(String titleString, String categoryString, float cost, int id) {
		this.titleString = titleString;
		this.categoryString = categoryString;
		this.cost = cost;
		this.id = id;
	}

}




