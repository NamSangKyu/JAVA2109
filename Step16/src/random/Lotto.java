package random;

import java.util.Random;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		//TreeSet과 Random 클래스를 이용해서 
		//로또번호 5set 출력
		//로또 번호 1~45까지 6개의 번호를 뽑음, 중복된 번호 X
		Random r = new Random();
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<5;i++) {
			while(set.size() < 6) {
				set.add(r.nextInt(45) + 1); // x % 45 + 1 ---> 1 ~ 45 
			}
			System.out.println(set);
			set.clear();
		}
	}

}
