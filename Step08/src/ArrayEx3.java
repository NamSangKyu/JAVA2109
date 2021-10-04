
public class ArrayEx3 {

	public static void main(String[] args) {
		//	 index - 0  1  2  3  4
		int[] arr = {1, 2, 3, 4, 5};//배열선언 및 초기화 - 1
		arr = new int[6]; //배열 선언
		arr = new int[] {6,7,8,9};// 배열 선언 및 초기화 - 2
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
