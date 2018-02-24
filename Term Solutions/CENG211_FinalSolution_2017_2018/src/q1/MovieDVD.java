package q1;

import java.util.ArrayList;
import java.util.List;

public class MovieDVD extends Media {

	List<Person> producerList;
	
	public MovieDVD(String title, String genre, List<Person> producers) {
		super(title, genre);
		producerList = new ArrayList<Person>();
		producerList.addAll(producers);		
	}

	@Override
	public String toString() {
		return "MovieDVD [title=" + getTitle() + ", genre=" + getGenre() + "producerList=" + producerList + "]";
	}
	
	
}
