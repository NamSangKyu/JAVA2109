import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {
		/*
		 * 	원의 반지름을 입력 받아서(정수)
		 *  해당 반지름의 원넓이를 계산하여 출력
		 */
		Scanner sc = new Scanner(System.in);
		//필요한 변수 : 반지름 - int , 원넓이 - double
		int r = 0;//초기화
		double circleArea = 0;
		//반지름 입력
		System.out.print("원의 반지름 값 하나를 입력하세요>");
		r = sc.nextInt(); 
		//원넓이 계산
		circleArea = r * r * 3.1415;
		
		//원넓이 출력 
		System.out.println("입력한 반지름의 원넓이 : "+circleArea);
	}

}
