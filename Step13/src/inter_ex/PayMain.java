package inter_ex;

public class PayMain {

	public static void main(String[] args) {
		Pay[] arr = new Pay[3];
		arr[0] = new Cooker("홍길동");
		arr[1] = new Player("김철수",10);
		arr[2] = new Employee("이영희", "대리");
		pay(arr,1000);
	}
	
	public static void pay(Pay[] arr, int money) {
		for(int i=0;i < arr.length;i++) {
			arr[i].pay(money);
		}
	}
}
