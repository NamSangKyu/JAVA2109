import java.util.Scanner;

public class NumberInputTest {

	public static void main(String[] args) {
		//데이터 입력을 받기위해서 Scanner를 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력>");
		int n1 = sc.nextInt();
		System.out.println(n1 * 2);
		
	}

}
