package exception;

public class ExceptionMain01 {

	public static void main(String[] args) {
		String n = "345";
		try {
			//작업영역, try 영역에서는 중간에 Exception이 발생할 수 있다.
			int i = Integer.parseInt(n);
			
			System.out.println(i);
		}catch(NumberFormatException e) {
			//Exception 처리 영역, 정상적으로 처리되면 강제 종료가 이루어지지않고
			//다음 일을 진행함
			System.out.println(e.getMessage());
		}finally {
			//Exception 발생 여부와 상관 없이 실행되는 영역
			//try와 catch 후에 실행
			System.out.println("finally 영역");
		}
		
		System.out.println("프로그램 종료");
	}

}
