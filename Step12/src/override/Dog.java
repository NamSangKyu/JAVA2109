package override;

public class Dog extends Animal{
	//오버라이딩 - 부모가 물려준 메서드를 재구현
	//			 메서드 형태가 일치한다.
	public void eat() {
		System.out.println("개가 사료를 먹습니다.");
	}
}
