package static02;

public class Number {
	private int none_static_num;
	private static int static_num = 1000;
	
	public void none_static_method() {
		none_static_num++;
		static_num++;//static이 안붙은 것들은 메모리가 할당되야 실행되기 때문에 접근이 O
	}
	
	public static void static_method() {
		//none_static_num++; // static에서 static이 아닌것들에게는 접근이 X
		static_num++;
	}
	
}
