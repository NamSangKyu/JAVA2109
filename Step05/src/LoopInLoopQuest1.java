
public class LoopInLoopQuest1 {
	/*
	 * 	아래와 같은 형태로 출력
	 * 		*
	 * 		**
	 * 		***
	 * 		****
	 * 		*****
	 */
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();//줄바꿈
		}
	}

}
