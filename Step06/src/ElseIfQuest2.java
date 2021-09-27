import java.util.Scanner;

public class ElseIfQuest2 {

	public static void main(String[] args) {
		/*
		 * 	평점 하나(double)를 입력 받아서
		 *  평점에 해당하는 성적 등급을 출력
		 *  4.5 	  ---> A+ 
		 *  4.0 ~ 4.4 ---> A
		 *  3.5 ~ 3.9 ---> B+
		 *  3.0 ~ 3.4 ---> B
		 *  2.5 ~ 2.9 ---> C+
		 *  2.0 ~ 2.4 ---> C
		 *  1.5 ~ 1.9 ---> D+
		 *  1.0 ~ 1.4 ---> D
		 *  0.0 ~ 0.9 ---> F
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("평점 입력 > ");
		double score = sc.nextDouble();
		int s = (int)(score / 0.5);
		if(s == 9) 
			System.out.println("A+");
		else if(s == 8)
			System.out.println("A");
		else if(s == 7)
			System.out.println("B+");
		else if(s == 6)
			System.out.println("B");
		else if(s == 5)
			System.out.println("C+");
		else if(s == 4)
			System.out.println("C");
		else if(s == 3)
			System.out.println("D+");
		else if(s == 2)
			System.out.println("D");
		else
			System.out.println("F");
			
		
		
		
	}

}




