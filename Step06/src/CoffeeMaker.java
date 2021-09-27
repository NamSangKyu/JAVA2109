import java.util.Scanner;

public class CoffeeMaker {

	public static void main(String[] args) {
		System.out.println("1 - 블랙커피");
		System.out.println("2 - 설탕커피");
		System.out.println("3 - 밀크커피");
		System.out.print("원하시는 메뉴 번호를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		switch(menu) {
		case 3:
			System.out.println("프림을 넣습니다.");
		case 2:
			System.out.println("설탕을 넣습니다.");
		case 1:
			System.out.println("커피를 넣습니다.");
		}
		System.out.println("커피 나왔습니다.");
	}

}
