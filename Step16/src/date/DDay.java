package date;

import java.util.Calendar;

public class DDay {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		end.set(Calendar.MONTH, 11);//12월 설정
		end.set(Calendar.DAY_OF_MONTH, 31);//31일 설정
		long diff = end.getTimeInMillis() - today.getTimeInMillis();
		System.out.println(diff / (1000 * 60 * 60 * 24));//해당값을 일(Day)로 변환
	}

}
