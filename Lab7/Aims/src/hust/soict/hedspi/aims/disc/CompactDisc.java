package hust.soict.hedspi.aims.disc;

import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.interfaces.Playable;
import hust.soict.hedspi.aims.track.Track;

public class CompactDisc extends Disc implements Playable{
	private String artistString;
	private List<Track> tracks = new ArrayList<Track>();

	public String getArtistString() {
		return artistString;
	}

	public CompactDisc(String titleString, String categoryString, float cost, int id, String artiString, List<Track> tracks, int length) {
		super(titleString, categoryString, cost, id, length);
		this.artistString = artiString;
		this.tracks = tracks;
	}
	
	public void addTrack(Track inputTrack) {
		if(tracks.contains(inputTrack)) {
			System.out.println("The input track is already in the list of tracks");
		}
		else {
			tracks.add(inputTrack);
		}
	}

	public void removeTrack(Track inputTrack) {
		if(tracks.contains(inputTrack)) {
			tracks.remove(inputTrack);
		}
		else {
			System.out.println("The input track not existed in the list of tracks");
		}
	}
	
	public int getLength() {
		int totalLength = 0;
		for(Track tempTrack:tracks) {
			totalLength = totalLength + tempTrack.getLength();
		}
		return totalLength;
	}

	@Override
	public void play() {
		System.out.println("CD :" + this.getTitleString());
		for(Track temp : tracks) {
			temp.play();
		}
		System.out.println("Total length :" + this.getLength());
		
	}
}



