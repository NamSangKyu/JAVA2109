
public class Calculator {
	int num1;
	int num2;

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	int sum() {
		int result = 0;
		result = num1 + num2;
		return result;
	}

	double areaCircle(double r) {
		return r * r * 3.1415;
	}

	int maxNumber(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		}
		return n2;
	}
}





