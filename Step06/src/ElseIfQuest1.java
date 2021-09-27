import java.util.Scanner;

public class ElseIfQuest1 {

	public static void main(String[] args) {
		/*
		 * 	나이를 입력 받아서 해당 나이에 맞는 입장료를 출력
		 *  0세~7세 : 아동 500원
		 *  8세~13세 : 어린이 700원
		 *  14세~19세 : 청소년 1000원
		 *  20세~59세 : 성인 1500원
		 *  60세~ : 노인 1200원
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age <= 7) {
			System.out.println("아동입니다. 입장료는 500원 입니다.");
		}else if(age <= 13) {
			System.out.println("어린이입니다. 입장료는 700원 입니다.");
		}else if(age <= 19) {
			System.out.println("청소년입니다. 입장료는 1000원 입니다.");
		}else if(age <= 59) {
			System.out.println("성인입니다. 입장료는 1500원 입니다.");
		}else {
			System.out.println("노인입니다. 입장료는 1200원 입니다.");
		}
		
		if(age >= 60) {
			System.out.println("노인입니다. 입장료는 1200원 입니다.");
		}else if(age >= 20) {
			System.out.println("성인입니다. 입장료는 1500원 입니다.");
		}else if(age >= 14) {
			System.out.println("청소년입니다. 입장료는 1000원 입니다.");
		}else if(age >= 8) {
			System.out.println("어린이입니다. 입장료는 700원 입니다.");
		}else {
			System.out.println("아동입니다. 입장료는 500원 입니다.");
		}
	}

}








