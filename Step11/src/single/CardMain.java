package single;

public class CardMain {

	public static void main(String[] args) {
		CardFactory factory = CardFactory.getInstance();
		Card c1 = factory.createCard("홍길동");
		factory = CardFactory.getInstance();
		Card c2 = factory.createCard("김철수");
		factory = CardFactory.getInstance();
		Card c3 = factory.createCard("이영수");
		factory = CardFactory.getInstance();
		Card c4 = factory.createCard("박영희");
		
		c1.printCardInfo();
		c2.printCardInfo();
		c3.printCardInfo();
		c4.printCardInfo();
	}

}
