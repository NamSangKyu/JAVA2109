import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력해주세요(단,단위는10 이고 10원이상) >>> ");
		int m = sc.nextInt();
		
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0;
		

		while(m >= 10) {
			if(50000<=m) {
				m-=50000;
				a++;
			}
			else if(10000<=m) {
				m-=10000;
				b++;				
			}
			else if(5000<=m) {
				m-=5000;
				c++;				
			}
			else if(1000<=m) {
				m-=1000;
				d++;				
			}
			else if(500<=m) {
				m-=500;
				e++;				
			}
			else if(100<=m) {
				m-=100;
				f++;				
			}
			else if(50<=m) {
				m-=50;
				g++;				
			}
			else {
				m-=10;
				h++;
			}
		}
		System.out.println("50000원 "+a+"개");
		System.out.println("10000원 "+b+"개");
		System.out.println("5000원 "+c+"개");
		System.out.println("1000원 "+d+"개");
		System.out.println("500원 "+e+"개");
		System.out.println("100원 "+f+"개");
		System.out.println("50원 "+g+"개");
		System.out.println("10원 "+h+"개");
	}



}
