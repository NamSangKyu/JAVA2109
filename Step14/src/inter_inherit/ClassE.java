package inter_inherit;

public class ClassE implements B, C{

	//겹치는 추상 메서드는 한번만 만들면 됨
	@Override
	public void methodA() {
		System.out.println("A");
	}
	@Override
	public void methodC() {
		System.out.println("C");
	}
	@Override
	public void methodB() {
		System.out.println("B");
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		B.super.method1();
	}

}
