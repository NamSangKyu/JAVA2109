
public class ContinueEx {

	public static void main(String[] args) {
		for(int i=1;i<101;i++) {
			if(i%2==0)
				continue;//남은 코드를 무시하고 다음 반복 회차로 넘어감
			System.out.println(i);
		}
	}

}
