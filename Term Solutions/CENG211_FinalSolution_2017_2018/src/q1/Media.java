package q1;

public abstract class Media {

	private String title;
	private String genre;
	private int numberOfBorrows;
	private boolean isBorrowed;
	
	public Media(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}
	
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public int getNumberOfBorrows() {
		return numberOfBorrows;
	}
	public boolean isBorrowed() {
		return isBorrowed;
	}
	
	public void borrow() {
		numberOfBorrows = numberOfBorrows + 1;
		isBorrowed = true;
	}

	public void giveBack() {
		isBorrowed = false;
	}

	@Override
	public String toString() {
		return "Media [title=" + title + ", genre=" + genre + "]";
	}
	
}
