
public class MethodEx2 {

	public static void main(String[] args) {
		Calculator cal = new Calculator(5, 9);
		int result = cal.sum();
		System.out.println(result);
		System.out.println(cal.areaCircle(5));
		System.out.println(cal.maxNumber(10, 20));
		System.out.println(cal.maxNumber(20, 10));
	}

}
