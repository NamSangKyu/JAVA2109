
public class BreakEx {

	public static void main(String[] args) {
		int i = 1;
		while(true) {
			System.out.println(i);
			if(i==100)
				break;//break를 직접 감싸고 있는 반복문 하나를 종료
			i++;			
		}
	}

}
