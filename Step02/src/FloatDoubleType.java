
public class FloatDoubleType {
	/*
	 * 데이터 종류 
	 * 		정수, 실수, 문자, 논리값 
	 * 데이터 종류마다 저장하는 형태, 종류가 다르면 저장을 할 수가 없음
	 */
	public static void main(String[] args) {
		// int num = 3.1415; // 정수형 변수에 실수를 저장할수 없다.
		// 실수형 변수 타입 float(4) double(8)
		double pi = 3.1415;
		System.out.println(pi);
		// 반지름이 3인 원넓이 출력
		System.out.println(3 * 3 * pi);
		
		float f = 3.1415f;//3.1415 ---> double 형, 3.1415f ---> float형
		System.out.println(3 * 3 * f);
		
		
	}

}
