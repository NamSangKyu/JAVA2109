
public class CastingMain {
	/*
	 * 데이터 형변환
	 * 		int	   ====> double
	 * 		double ====> int
	 * 		타입을 바꾸는 행위를 형변환
	 * 강제로 형변환
	 * 자동으로 형변환
	 */
	public static void main(String[] args) {
		int r = 3;
		double area = 0.0;
		
		//자동으로 형변환 됨
		//작은 개념이 큰개념, 메모리가 작은것이 큰것으로 바뀌는거 - 자동
		area = r * r * 3.1415;
		
		System.out.println(area);
		
		//강제로 형변환 (변수타입)값 or (변수타입)변수 
		//데이터손실이 있을수 있음
		int iarea = (int)area;
		System.out.println(iarea);
	}

}
