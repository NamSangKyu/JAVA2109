
public class LoopInLoop {

	public static void main(String[] args) {
		/*
		 * 반복문 중첩 반복문 실행영역에 또 다른 반복문이 있는 형태
		 * 
		 * 구구단 2단 ~ 9단까지 출력 - for문 
		 * 		단 증가 
		 * 		1~9까지 곱한 결과를 출력
		 */
		for (int dan = 2; dan < 10; dan++) {
			System.out.println(dan + " 단");
			for(int is = 1;is < 10;is++) {
				System.out.println(dan + " * " + is + " = " + dan * is);				
			}
		}
	}

}
