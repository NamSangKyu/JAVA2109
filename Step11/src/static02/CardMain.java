package static02;

public class CardMain {

	public static void main(String[] args) {
		Card c1 =  new Card("김철수");
		Card c2 =  new Card("홍길동");
		Card c3 =  new Card("이영수");
		Card c4 =  new Card("박영희");
		
		c1.printCardInfo();
		c2.printCardInfo();
		c3.printCardInfo();
		c4.printCardInfo();
	}

}
