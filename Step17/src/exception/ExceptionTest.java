package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		//			 0 1 2 3 4
		int[] arr = {1,2,3,4,5};
		
		for (int i = 0; i < 6; i++) {
			System.out.println(arr[i]);//문법 에러 X, 실행 중 에러(run time error) O
		}
		//실행 중 에러가 발생하면 프로그램이 강제 종료됨
		System.out.println("프로그램 종료");
	}

}
