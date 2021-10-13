package single;
//필드는 카드번호-int, 사용자-String
//생성자로 카드번호와 사용자를 받아서 초기화하는 생성자만듬
//카드 정보 출력하는 메서드
public class Card {
	private String name;
	private int cardNumber;
	
	public Card(String name, int cardNumber) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
	}
	
	public void printCardInfo() {
		System.out.println(name + " " + cardNumber);
	}
}
