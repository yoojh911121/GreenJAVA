package kr.green.util;

public class DateUtil {

	// 윤년을 판단하는 메서드를 작성하시오!!!
	// 윤년의 판단
	// 년도가 400의 배수면 윤년입니다.
	// 또는
	// 년도가 4의 배수이면서 100의 배수가 아니면 윤년
	public static boolean isLeapYear(int year) { // 아주 좋은 코드다.
		return year % 400 == 0 || year % 4 == 0 && year % 1000 != 0; // 조건식 결과가 boolean이다!!! if가 필요없다.
	}

	// 년월을 입력받아 월의 마지막 날짜를 구해주는 메서드
	public static int getLastDay(int year, int month) {
		int[] m = {31,28,31,30,31,30,31,31,30,31,30,31};
		m[1] = isLeapYear(year) ? 29 : 28;
		return m[month-1];
	}
	// 1년 1월 1일부터 지정 날짜까지의 총일수를 구하는 메서드
	public static int getTotalDay(int year, int month, int date) {
		// 1. 전년도까지의 일수
		int  totalDay = (year-1) * 365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		// 2. 전월까지의 일수
		for(int i=1;i<month;i++) totalDay += getLastDay(year, i);
		// 3. 일 더하기
		totalDay += date;	
		return totalDay;
	}
	
	// 요일을 구해주는 메서드
	// 총일수를 7로 나눈 나머지가 0이면 일요일, 1이면 월요일... 6이면 토요일이다.
	public static int getWeekOfDay(int year, int month, int date) {
		return getTotalDay(year, month, date)%7;
	}
	
	// 달력을 출력해주는 메서드
	public static void printCalendar(int year, int month) {
		// 달력을 출력해 보자!!!
		System.out.printf("%26d년 %02d월\n\n", year, month);
		System.out.println("     일     월     화     수     목     금     토");
		for(int i=0;i<getWeekOfDay(year, month, 1);i++) { // 1일의 요일을 맞추기 위해 앞에 공백 출력
			System.out.print("       ");
		}
		for(int i=1;i<=getLastDay(year, month);i++) { // 나지막 날짜까지 출력
			System.out.printf("%7d", i);
			if(getWeekOfDay(year, month, i)==6) System.out.println(); // 토요일이면 줄바꿈
		}
		System.out.println("\n");
	}
}
