
public class Operator2 {
	/*
	 * 복합대입연산자
	 * 		+=  -=  *=   /=   %= 
	 * 
	 * 값을 하나의 변수에 계산해서 누적
	 * 문자열이나 HTML 태그, 문서 요소들을 조립 --->  +=
	 */
	public static void main(String[] args) {
		int num = 100;
		num = num + 20;//num과 20을 더한 다음에 변수 num에 저장
		System.out.println(num);
		
		//둘다 같은 연산
		num += 20; //num = num + 20;
		System.out.println(num);//140

		num -= 30;//num = num - 30;
		System.out.println(num);//110

		num *= 2;//num = num * 2;
		System.out.println(num);//220
		
		num /= 3;//num = num / 3;
		System.out.println(num);//73

		num %= 7;//num = num % 7;
		System.out.println(num);//3
	}

}
