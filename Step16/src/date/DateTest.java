package date;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toGMTString());
		System.out.println(date.toLocaleString());
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		//System.out.println(cal.get(Calendar.HOUR));//12시간 기준
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));//24시간 기준
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		Date now = cal.getTime();//getTime 메서드로 현재 날짜 시간을 뽑음
		System.out.println(now);
		
	}

}
