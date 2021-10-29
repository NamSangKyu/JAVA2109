package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DateFormatMain {

	public static void main(String[] args) {
		//오늘 날짜 생성
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.MONTH, 7);
		cal.set(Calendar.DAY_OF_MONTH, 4);
		//SimpleDateFormat
		//날짜 서식 문자를 이용하여 원하는 형태로 날짜를 문자열로 만들어주는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("y");//연도 : 네자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("yy");//연도 : 두자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("M");//월 : 한자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MM");//월 : 두자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMM");//월 : 로컬형식 월
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMMM");//월 : 로컬형식 월
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("d");  //일 : 한자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("dd"); //일 : 두자리
		System.out.println(sdf.format(cal.getTime()));
		
		
	}

}



