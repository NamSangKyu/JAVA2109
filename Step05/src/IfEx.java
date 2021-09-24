import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		//숫자 하나 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		int n = sc.nextInt();
		//입력한 숫자가 양수, 음수, 0인지 체크해서 출력
		if(n > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		}
		if(n == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		if(n < 0) {
			System.out.println("입력하신 숫자는 음수입니다.");
		}
		
	}

}
