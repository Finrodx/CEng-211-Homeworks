package q1;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp {

	public static void main(String[] args) {
		
		Library library = new Library("Grand Library");

		Person author11 = new Person("author11");
		Person author12 = new Person("author12");
		Person author13 = new Person("author13");
		Person author14 = new Person("author14");
		
		List<Person> authorList11 = new ArrayList<Person>();
		authorList11.add(author11);
		List<Person> authorList12 = new ArrayList<Person>();
		authorList12.add(author11);
		authorList12.add(author12);
		List<Person> authorList13 = new ArrayList<Person>();
		authorList13.add(author11);
		authorList13.add(author12);
		authorList13.add(author13);
		List<Person> authorList14 = new ArrayList<Person>();
		authorList14.add(author11);
		authorList14.add(author12);
		authorList14.add(author13);
		authorList14.add(author14);
		
		Media media11 = new Book("BookTitle11", "Drama", authorList11);
		Media media12 = new Book("BookTitle12", "Comedy", authorList12);
		Media media13 = new Book("BookTitle13", "Drama", authorList13);
		Media media14 = new Book("BookTitle14", "Drama", authorList14);

		Person producer21 = new Person("producer11");
		Person producer22 = new Person("producer12");
		Person producer23 = new Person("producer13");
		Person producer24 = new Person("producer14");
		
		List<Person> producerList21 = new ArrayList<Person>();
		producerList21.add(producer21);
		List<Person> producerList22 = new ArrayList<Person>();
		producerList22.add(producer21);
		producerList22.add(producer22);
		List<Person> producerList23 = new ArrayList<Person>();
		producerList23.add(producer21);
		producerList23.add(producer22);
		producerList23.add(producer23);
		List<Person> producerList24 = new ArrayList<Person>();
		producerList24.add(producer21);
		producerList24.add(producer22);
		producerList24.add(producer23);
		producerList24.add(producer24);

		Media media21 = new MovieDVD("MovieTitle21", "Drama", producerList21);
		Media media22 = new MovieDVD("MovieTitle22", "Horror", producerList22);
		Media media23 = new MovieDVD("MovieTitle23", "Comedy", producerList23);
		Media media24 = new MovieDVD("MovieTitle24", "Horror", producerList24);
		
		library.add(media11);
		library.add(media12);
		library.add(media13);
		library.add(media14);
		library.add(media21);
		library.add(media22);
		library.add(media23);
		library.add(media24);

		List<Media> dramaMediaList;
		dramaMediaList = library.findAllMediaGivenGenre("Drama");
		System.out.println("Drama Media List");
		System.out.println(dramaMediaList.toString());
		
		List<Media> comedyMediaList;
		comedyMediaList = library.findAllMediaGivenGenre("Comedy");
		System.out.println("Comedy Media List");
		System.out.println(comedyMediaList.toString());

		List<Media> horrorMediaList;
		horrorMediaList = library.findAllMediaGivenGenre("Horror");
		System.out.println("Horror Media List");
		System.out.println(horrorMediaList.toString());

		LibraryMember member1 = new LibraryMember("Member1", 1);
		LibraryMember member2 = new LibraryMember("Member2", 2);
		LibraryMember member3 = new LibraryMember("Member3", 3);
		
		member1.borrow(media14);
		member3.borrow(media23);
		member1.borrow(media12);
		member1.giveBack(media14);
		member2.borrow(media14);
		member3.borrow(media24);
		member3.giveBack(media23);
		
		Media mostBorrowedMedia;
		mostBorrowedMedia = library.findMostBorrowedMedia();
		System.out.println("Most Borrowed Media");
		System.out.println(mostBorrowedMedia.toString());
		
	}

}
