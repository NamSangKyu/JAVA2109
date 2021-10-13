package single;
/*
 * 	CardFactory는 카드번호를 가지고 있음
 * 	카드를 생성해주는 createCard() 메서드가 있음
 *  카드 생성시 카드번호가 1씩 증가
 *  카드번호 하나 필드로 가지고 있음
 */
//싱글톤 패턴 - 객체하나로 프로그램 시작부터 종료까지 사용되는 방법
//	static으로 선언된 객체, getter, private 생성자 --> 3가지로 구성 
public class CardFactory {
	private static int cardSequence = 1000;
	private static CardFactory instance = new CardFactory();
	
	private CardFactory() {	}

	public Card createCard(String name) {
		return new Card(name, cardSequence++);
	}

	//static 선언된 instance 변수를 리턴
	public static CardFactory getInstance() {
		if(instance == null)
			instance = new CardFactory();
		return instance;
	}
}









