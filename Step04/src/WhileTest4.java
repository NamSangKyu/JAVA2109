import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		/*
		 * 	숫자 하나를 입력받아서
		 *  입력 받은 숫자만큼 Hello World를 출력
		 *  예> 5 입력
		 *  	Hello World가 5번 출력 
		Scanner sc = new Scanner(System.in);
		int n=0,i=0;
		System.out.print("숫자 입력>");
		n = sc.nextInt();
		
		while(i<n) {
			System.out.println("Hello World");
			i++;
		}
		 */
		Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.print("숫자 입력>");
		n = sc.nextInt();
		
		while(n>0) {
			System.out.println("Hello World");
			n--;
		}
	}

}






