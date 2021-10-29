package exception;

import java.util.Scanner;

public class ExceptionMain06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		try {
			System.out.print("나이 입력 : ");
			age = sc.nextInt();

			if (age < 20)
				throw new AgeException("미성년자 관람불가");
			boolean sheet = false;
			System.out.println("해당 영화 예매 가능");
			System.out.println("좌석 선택");
			if(!sheet)
				throw new SheetException("선택하신 좌석이 없습니다.");
			System.out.println("결제 시작");
			System.out.println("결제 중.....");
			System.out.println("결제 완료");
		} catch (AgeException e) {
			System.out.println(e.getMessage());
			System.out.println("예매 처리 초기화");
		} catch (SheetException e) {
			System.out.println(e.getMessage());
			System.out.println("예매 처리 초기화");
		}
	}

}
