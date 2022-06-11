package hust.soict.hedspi.aims.book;

import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.interfaces.Playable;
import hust.soict.hedspi.aims.media.Media;

public class Book extends Media implements Playable{
	
	private List<String> authorStrings = new ArrayList<String>();

	public Book(String titleString, String categoryString, float cost, int id, List<String> authoStrings) {
		super(titleString, categoryString, cost, id);
		this.authorStrings = authoStrings;
		
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

	@Override
	public void play() {
		System.out.println("Playing book: " + this.getTitleString());
		for(String temp:authorStrings) {
			System.out.println("Author book: " + temp);
		}
		
	}
}
