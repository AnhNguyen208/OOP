package hust.soict.hedspi.aims.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hust.soict.hedspi.aims.interfaces.Playable;
import hust.soict.hedspi.aims.media.Media;

public class Book extends Media implements Playable{
	
	private List<String> authorStrings = new ArrayList<String>();
	private String contentString;
	private List <String> contentTokens; 
	private Map<String,Integer> map;

	public Book(String titleString, String categoryString, float cost, int id, List<String> authoStrings) {
		super(titleString, categoryString, cost, id);
		this.authorStrings = authoStrings;
		
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public List<String> getContentTokens() {
		return contentTokens;
	}

	public void setContentTokens(List<String> contentTokens) {
		this.contentTokens = contentTokens;
	}

	public String getContentString() {
		return contentString;
	}

	public void setContentString(String contentString) {
		this.contentString = contentString;
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

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void processContent() {
		this.setContentTokens(new ArrayList<String>());
		this.setMap(new HashMap<String, Integer>());
		String[] tokenStrings = this.contentString.split(" ");
		for(String tokenString:tokenStrings) {
			this.contentTokens.add(tokenString);
			if (this.map.containsKey(tokenString))
                this.map.put(tokenString, map.get(tokenString) + 1);
 
            else
                map.put(tokenString, 1);
		}
		System.out.println(map);
	}
}
