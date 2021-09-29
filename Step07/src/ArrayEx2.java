public class ArrayEx2 {

	public static void main(String[] args) {
		//new 할당된 변수들은 기본적으로 값이 0, 정수 - 0, 실수 - 0.0, 논리 - false
		int[] arr1 = new int[5];
		double[] arr2 = new double[5];
		boolean[] arr3 = new boolean[5];
		
		//arr1, arr2, arr3의 내용을 전부 출력
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i] + " ");
		System.out.println();
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
		for(int i=0;i<arr3.length;i++)
			System.out.print(arr3[i] + " ");
		System.out.println();
	}

}



