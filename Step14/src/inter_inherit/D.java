package inter_inherit;

public interface D extends B,C{
	public void methodD();

	//부모 인터페이스에 디폴트 메서드가 동일한것이 있으면 반드시 오버라이딩 해야함
	@Override
	default void method1() {
		B.super.method1();
		C.super.method1();
	}
}
