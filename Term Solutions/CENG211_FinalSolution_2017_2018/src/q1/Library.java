package q1;

import java.util.ArrayList;
import java.util.List;

public class Library {

	String name;
	List<Media> mediaList;
	List<LibraryMember> memberList;
	
	public Library(String name) {
		this.name = name;
		mediaList = new ArrayList<Media>();
	}
	
	public void add(Media media) {
		mediaList.add(media);
	}
	
	public void remove(Media media) {
		mediaList.remove(media);
	}

	public void add(LibraryMember libraryMember) {
		memberList.add(libraryMember);
	}
	
	public void remove(LibraryMember libraryMember) {
		memberList.remove(libraryMember);
	}

	public List<Media> findAllMediaGivenGenre(String genre) {
		List<Media> givenGenreMediaList = new ArrayList<Media>();
		for( Media media: mediaList) {
			if (media.getGenre().equals(genre))
				givenGenreMediaList.add(media);
		}
		return givenGenreMediaList;
	}
	
	public Media findMostBorrowedMedia() {
		Media mostBorrowedMedia = null;
		int maximum = 0;
		for( Media media: mediaList) {
			if (media.getNumberOfBorrows() > maximum) {
				mostBorrowedMedia = media;
				maximum = media.getNumberOfBorrows();
			}
		}
		return mostBorrowedMedia;
	}
}
