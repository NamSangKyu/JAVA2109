package abstract_ex;
/*
 * 추상 클래스(Abstract Class)
 * 	 - 직접적으로 생성이 되지않는 클래스
 *   - class 앞에 abstract 추가
 *   
 */
public abstract class Animal {

	public Animal() {
		System.out.println("Animal Constructor");
	}
	
	public void eat() {
		System.out.println("동물 먹이를 먹습니다.");
	}
}
