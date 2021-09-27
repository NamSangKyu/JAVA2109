
public class BreakQuest {

	public static void main(String[] args) {
		/*
		 * 			AZ
		 * 		+	ZA
		 * ------------
		 * 			99
		 * 해당 식이 성립되는 숫자 A와 Z를 출력
		 * 
		 */
		for(int A = 0; A < 10; A++) {
			for(int Z = 0; Z < 10; Z++) {
				if(A*10+Z + Z*10+A == 99) {
					System.out.println("A : " + A +", Z : "+ Z);
					break;//더 이상 작업할 필요가 없을 때
				}
			}
		}
	}

}
