package inter_inherit;

public interface B extends A{
	public void methodB();
	default void method1() {
		System.out.println("B method1");
	}
}
