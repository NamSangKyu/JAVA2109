
public class StringEx1 {

	public static void main(String[] args) {
		String str1 = "Hello World";
		System.out.println(str1);
		String str2 = null;
		System.out.println(str2);
		String str3 = new String("Hello World");
		System.out.println(str3);
		
		System.out.println(str1 + str3);//문자열 덧셈시 하나의 문자열로 만듬
	}

}
