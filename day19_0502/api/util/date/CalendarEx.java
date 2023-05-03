package day19_0502.api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {

		//Calendar cal = new Calendar();
		
		// static메서드를 사용해서 객체를 반환하는 모형
		Calendar cal = Calendar.getInstance();
//		System.out.println(Calendar.YEAR);	//1
//		System.out.println(Calendar.MONTH);	//2
//		System.out.println(Calendar.DATE);	//5
		
//		int year = cal.get(1);
//		System.out.println(year);
		
		// 년
		int year2 = cal.get(Calendar.YEAR);
		System.out.println(year2);
		
		// 월 = 1작게 나오기 때문에 +1 해줘야 된다
		int month = cal.get(Calendar.MONTH);
		System.out.println(month + 1);
		
		// 일
		int day = cal.get(Calendar.DATE);
		System.out.println(day);
		
		// 시
		int hour = cal.get(Calendar.HOUR);
		System.out.println(hour);
		
		// 분
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);
		
		// 초
		int second = cal.get(Calendar.SECOND);
		System.out.println(second);
	}

}
