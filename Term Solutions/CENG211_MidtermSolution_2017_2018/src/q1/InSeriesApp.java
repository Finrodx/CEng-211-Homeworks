package q1;

public class InSeriesApp {

	public static void main(String[] args) {
		Sequence sequence = new Sequence();
		if (sequence.sequenceChecker(1, 218))
			System.out.println("in Series");
		else 
			System.out.println("not in Series");
	}
	
}
