package abstract_ex;
/*
 * 추상 클래스(Abstract Class)
 * 	 - 직접적으로 생성이 되지않는 클래스
 *   - class 앞에 abstract 추가
 * 추상 메서드(Abstract Method)
 * 	 - 메서드 구현부가 없음
 *   - 상속받는 클래스가 생성이 될려면 추상 메서드를 반드시 구현
 *   - 만약 추상메서드를 오버라이딩 하지 않으면 추상 클래스로 만들어야 함  
 */
public abstract class Animal {

	public Animal() {
		System.out.println("Animal Constructor");
	}
	//추상메서드 - 접근제어자 다음에 abstract 키워드 작성
	public abstract void eat();
}
