package inter_inherit;

public interface A {
	public void methodA();
	default void method() {
		System.out.println("default A");
	}
}
