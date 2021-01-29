
public class MethodEx02 {
	public static void main(String[] args) {
		int sum = 1 + 1 + 2 + 1 + 2 + 3 + 1 + 2 + 3 + 4 + 1 + 2 + 3 + 4 + 5;
		System.out.println("합계 : " + sum);
		System.out.println("합계 : " + (sum(1) + sum(2) + sum(3) + sum(4) + sum(5)));
		for (int i = 1996; i <= 2020; i++) {
			// System.out.println(i + "년은 " + (isLeapYear1(i) ? "윤년" : "평년") + "입니다.");
			// System.out.println(i + "년은 " + (isLeapYear2(i) ? "윤년" : "평년") + "입니다.");
			// System.out.println(i + "년은 " + (isLeapYear3(i) ? "윤년" : "평년") + "입니다.");
			System.out.println(i + "년은 " + (isLeapYear4(i) ? "윤년" : "평년") + "입니다.");
		}
	}

	public static int sum(int n) { // 메서드명 앞에 되돌려지는 값의 자료형을 쓴다.
		int s = 0;
		while (n > 0)
			s += n--;
		return s; // 결과를 호출한 곳으로 되돌려 준다.
	}
	
	
	

	// 윤년을 판단하는 메서드를 작성하시오!!!
	// 윤년의 판단
	// 년도가 400의 배수면 윤년입니다.
	// 또는
	// 년도가 4의 배수이면서 100의 배수가 아니면 윤년
	public static boolean isLeapYear4(int year) { // 아주 좋은 코드다.
		return year % 400 == 0 || year % 4 == 0 && year % 1000 != 0; // 조건식 결과가 boolean이다!!! if가 필요없다.
	}

	public static boolean isLeapYear3(int year) { // 리턴이 한번 나온다. 좋은 코드다.
		boolean result = false;
		if (year % 400 == 0 || year % 4 == 0 && year % 1000 != 0)
			result = true;
		return result;
	}
	
	public static boolean isLeapYear2(int year) { // 리턴이 여러번 나온다. 좋지 않은 코드다.
		if (year % 400 == 0 || year % 4 == 0 && year % 1000 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isLeapYear1(int year) {
		boolean result = false;
		if (year % 400 == 0) {
			result = true;
		} else if (year % 4 == 0) {
			if (year % 1000 != 0) {
				result = true;
			}
		}
		return result;
	}

}
