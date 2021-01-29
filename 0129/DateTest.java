import java.util.Calendar;

import kr.green.util.DateUtil;

public class DateTest {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		// cal.set(2021, 1, 1);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 0~11을 리턴
		int date = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK); // 요일을 1~7로 리턴
		int lastday = cal.getActualMaximum(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일\n", year, month, date);
		System.out.println(week);
		System.out.println(lastday);
		
		System.out.println(DateUtil.getWeekOfDay(year, month, date)); // 0 ~ 6
		System.out.println(DateUtil.getLastDay(year, month));
		
		System.out.println(DateUtil.getTotalDay(year, month, date) + "일");
		System.out.println("내가 살아온 일수 : " + 
		                   (DateUtil.getTotalDay(year, month, date) - DateUtil.getTotalDay(1992, 8, 22) + 1));
		System.out.println("\n\n\n");
		// 달력을 출력해 보자!!!
		System.out.printf("%26d년 %02d월\n\n", year, month);
		System.out.println("     일     월     화     수     목     금     토");
		for(int i=0;i<DateUtil.getWeekOfDay(year, month, 1);i++) { // 1일의 요일을 맞추기 위해 앞에 공백 출력
			System.out.print("       ");
		}
		for(int i=1;i<=DateUtil.getLastDay(year, month);i++) { // 나지막 날짜까지 출력
			System.out.printf("%7d", i);
			if(DateUtil.getWeekOfDay(year, month, i)==6) System.out.println(); // 토요일이면 줄바꿈
		}
		System.out.println("\n");
		
		
		for(int i=1;i<=12;i++) {
			DateUtil.printCalendar(2021, i);
			System.out.println("\n");
		}
		
		
	}
}
