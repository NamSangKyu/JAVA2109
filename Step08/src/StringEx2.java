
public class StringEx2 {

	public static void main(String[] args) {
		String str1 = "안녕하세요";
		String str2 = new String("안녕하세요");
		String str3 = str1;
		
		System.out.println("주소값으로 비교");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		//실제 내용으로 문자열 비교
		System.out.println("내용으로 비교");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		
	}

}




