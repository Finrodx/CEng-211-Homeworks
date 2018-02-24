package q1;

public class LibraryMember extends Person {

	int id;
	
	public LibraryMember(String name, int id) {
		super(name);
		this.id = id;
	}
	
	public void borrow(Media media) {
		media.borrow();
	}

	public void giveBack(Media media) {
		media.giveBack();
	}
	
}
