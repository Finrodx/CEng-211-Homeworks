
public class Fruit {
	
	private String fruit;
	private int colarieValue;
	private Colour colour;
	private Seoson seoson;
	
	
	
	
	
	public Fruit(String fruit, int colarieValue, Colour colour, Seoson seoson) {
		super();
		this.fruit = fruit;
		this.colarieValue = colarieValue;
		setColour(colour);
		setSeoson(seoson);
	}
	
	
	public  String getFruit() {
		return fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	public int getColarieValue() {
		return colarieValue;
	}
	public void setColarieValue(int colarieValue) {
		this.colarieValue = colarieValue;
	}
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	public Seoson getSeoson() {
		return seoson;
	}
	public void setSeoson(Seoson seoson) {
		this.seoson = seoson;
	}


	@Override
	public String toString() {
		return "Fruit [fruit=" + fruit + ", colarieValue=" + colarieValue + ", colour=" + colour + ", seoson=" + seoson
				+ "]";
	}
	
	
	
	
}
