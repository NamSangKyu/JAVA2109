package static02;

public class Card {
	private int cardNumber = 1000;
	private String name;

	public Card(String name) {
		this.name = name;
		cardNumber++;
	}
	
	public void printCardInfo() {
		System.out.println(name + " " + cardNumber);
	}
	
	
	
}
