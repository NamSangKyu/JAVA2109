
public class LoopInLoopQuest2 {
	/*
	 * 	아래와 같은 형태로 출력
	 * 		    * 4  1  5 - i - 1 
	 * 		   ** 3  2
	 * 		  *** 2  3
	 * 		 **** 1  4
	 * 		***** 0  5
	 */
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();//줄바꿈
		}
	}

}
