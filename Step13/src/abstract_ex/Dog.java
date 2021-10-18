package abstract_ex;
//Animal 상속, eat 에서 출력할 메세지는 자유롭게
public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("개가 사료를 먹습니다.");
	}


}
