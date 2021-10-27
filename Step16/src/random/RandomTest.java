package random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextDouble()); //0.0~0.99999999... 범위에서 랜덤
		System.out.println(r.nextInt()); //int 형 범위에서 랜덤
		System.out.println(r.nextInt(10)); //0~9까지 랜덤
	}

}
