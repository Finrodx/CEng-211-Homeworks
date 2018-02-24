package q1;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

	List<Person> authorList;
	
	public Book(String title, String genre, List<Person> authors) {
		super(title, genre);
		authorList = new ArrayList<Person>();
		authorList.addAll(authors);
	}

	@Override
	public String toString() {
		return "Book [title=" + getTitle() + ", genre=" + getGenre() + "authorList=" + authorList + "]";
	}
	
	
}
