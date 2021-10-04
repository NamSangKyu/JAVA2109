
public class ArrayQuest2 {

	public static void main(String[] args) {
		//정수형 배열 10개 사이즈로 할당
		//배열에 미리 숫자 10개 원하는 숫자로 저장
		int[] arr = {5,32,465,457,23,5,87,34,11,45};
		
		//배열에 있는 숫자들중 5와 9의 배수의 개수를 출력
		int count = 0;//개수 저장할 변수
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 5 == 0 || arr[i] % 9 == 0)
				count++;
		}
		System.out.println("5와 9의 배수 개수 : "+count);
	}

}
