import java.util.Scanner;

public class WhileTest6 {

	public static void main(String[] args) {
		/*
		 * 	숫자하나 입력을 받으면
		 * 	입력한 숫자에 해당하는 구구단을 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 구구단 입력 >");
		int dan = sc.nextInt();
		
		int i = 1; 
		while(i < 10) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}
	}

}


