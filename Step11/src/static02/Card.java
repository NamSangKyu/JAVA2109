package static02;

public class Card {
	public static final long CARD_VERSION = 1L;
	private static int cardSequence = 1000;
	private int cardNumber;
	private String name;

	public Card(String name) {
		this.name = name;
		cardNumber = cardSequence++;
	}
	
	public void printCardInfo() {
		System.out.println(name + " " + cardNumber);
	}
	
	
	
}
