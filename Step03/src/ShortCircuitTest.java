
public class ShortCircuitTest {

	public static void main(String[] args) {
		int n1 = 10, n2 = 15;
		boolean result = false;
		
		//단락회로는 앞에있는 조건식에서 true/false가 결정이되면 뒤에 있는 조건식은 생략하고 넘어감
		result = n1 > 10 && ++n2 == 15;
		System.out.println(n2);
		result = n1 == 10 || ++n2 < 20;
		System.out.println(n2);
		
	}

}
