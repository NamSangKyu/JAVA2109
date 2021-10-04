import java.util.Scanner;

public class ArrayQuest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수형 배열 6개짜리를 선언 한후
		//배열에 숫자를 처음부터 끝까지 전부 입력 받으시오.
		int arr[] = new int[6];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		//배열에 입력된 숫자들 중 최대값, 최소값, 총합을 출력
		int max, min, total;
		max = min = total = arr[0]; //변수를 동일한 값으로 초기화 할 때
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max)//최대값
				max = arr[i];
			if(arr[i] < min)//최소값
				min = arr[i];
			total += arr[i];//총합
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		System.out.println("총합 : "+total);
	}

}






