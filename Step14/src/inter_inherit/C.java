package inter_inherit;

public interface C extends A{
	public void methodC();
	default void method1() {
		System.out.println("C method1");
	}
}
