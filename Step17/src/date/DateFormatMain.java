package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

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
		sdf.applyPattern("E");// 요일 : 한자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("EEEE");// 요일 : 풀네임
		System.out.println(sdf.format(cal.getTime()));
		//시간
		sdf.applyPattern("H"); //24시간 기준
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("HH");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("KK"); //12시간 기준
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("mm");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("ss");
		System.out.println(sdf.format(cal.getTime()));
		
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("yyyy년 MMM dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(cal.getTime()));
		
		
		
	}

}



