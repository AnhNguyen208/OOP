package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	
	private List<String> authorStrings = new ArrayList<String>();

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public List<String> getAuthorStrings() {
		return authorStrings;
	}

	public void setAuthorStrings(List<String> authorStrings) {
		this.authorStrings = authorStrings;
	}
	
	public void addAuthors(String authorNameString) {
		if(authorStrings.contains(authorNameString)) {
			System.out.println("The author is in the List");
		}
		else {
			System.out.println("Add author");
			authorStrings.add(authorNameString);
		}
	}

	public void removeAuthor(String authorNameString) {
		if (authorStrings.isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("Remove author");
			authorStrings.remove(authorNameString);
		}
	}
}
