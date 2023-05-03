package day19_0502.api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {

		// 기본적인 날짜 형식
		Date date = new Date();
		System.out.println(date);
		
		// 사용 마라~
		int year = date.getYear();
		System.out.println(year);
		
		// 1970년 1월 1일 00시 기준으로 밀리세컨으로 변경 => 날짜연산
		long milis = date.getTime();
		System.out.println(milis);
	
		//현재시간 + 1초 - +1000 했기 때문에 1초 차이가 난다
		Date date2 = new Date(System.currentTimeMillis() + 1000);
		System.out.println(date2);
		
		//시간 차이
		long milis2 = date2.getTime();
		System.out.println(milis2 - milis);
		
		System.out.println("================================");
		
		//사람이 보기편한 날짜로 변환(yyyy년 MM월 dd일 a(오전) hh시:mm분:ss초)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss");
		String now = sdf.format(date);
		System.out.println(now);
	}

}
