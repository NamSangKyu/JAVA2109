package exception;

public class ExceptionMain05 {

	public static void main(String[] args) {
		try {
			int[] arr = {1,2,3,4};
			
			arr[4] = 10;
			
			System.out.println("try 종료");
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
