public class ArrayEx1 {

	public static void main(String[] args) {
		/*
		 * 	배열(Array)
		 * 		하나의 변수명으로 변수를 여러개 선언하는 방법
		 *  이름이 같으면 누굴 불러야될지 모르기 때문에 변수에 번호표를 이용해서 사용
		 *  이 번호표를 index라 함
		 */
		//정수 5개 저장하는 배열 생성
		int[] arr = new int[5];
		//인덱스 : 0 ~ 개수 - 1
		//배열명[인덱스] --> 인덱스 번호까지 써야 하나의 변수로 사용
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//length는 현재 배열의 길이(개수)
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}



