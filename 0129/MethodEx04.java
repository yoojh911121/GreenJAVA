/*
재귀 호출(recursive call)
-------------------------
자신이 자신을 호출하는 메서드. 반드시 종료식이 들어가야 한다.
잘쓰면 약!!!! 잘못쓰면 독!!!!
*/
public class MethodEx04 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++)
			System.out.print(fibonacci(i) + " ");
		System.out.println();

		
		for (int i = 1; i <= 10; i++)
			System.out.print(recursiveFibonacci(i) + " ");
		System.out.println();
		
		// 50번째 피보나치수 보이기
		// 시간 재기
//		long startTime = System.currentTimeMillis();//System.nanoTime(); // 시작시간
//		System.out.println(fibonacci(50));
//		long endTime = System.currentTimeMillis();//System.nanoTime();   // 종료시간
//		System.out.println("실행시간 : " + (endTime-startTime) + "ms");
//		
//		startTime = System.currentTimeMillis();//System.nanoTime(); // 시작시간
//		System.out.println(recursiveFibonacci(50));
//		endTime = System.currentTimeMillis();//System.nanoTime();   // 종료시간
//		System.out.println("실행시간 : " + (endTime-startTime) + "ms");
		
		
		// 호출되는 과정을 한번 보자!!!!
		System.out.println(recursiveFibonacci2(6)); // 중복 호출이 많다!!!
		
	}
	// 재귀호출이 독이되는 경우!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// 자신을 한번 호출할때바다 두번씩 자신을 호출한다. 2의 누승 수로 호출이 늘어나므로 
	// 오히려 실행 성능을 저하 시킨다.  ===> 재귀호출시 자신을 1번만 호출하도록 작성하여야 한다.

	// 피보나치 수열(Fibonacci Sequence) : 1 1 2 3 5 8 .....
	// n번째 피보나치 수열을 리턴하는 일반 함수
	public static long fibonacci(int n) {
		long f = 0, s = 1;
		do {
			s += f;
			f = s - f;
			n--;
		} while (n > 1);
		return s;
	}

	// n번째 피보나치 수열을 리턴하는 재귀 함수
	public static long recursiveFibonacci(int n) {
		return n == 1 || n == 2 ? 1 : recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
	}
	
	// n번째 피보나치 수열을 리턴하는 재귀 함수
	public static long recursiveFibonacci2(int n) {
		System.out.println("recursiveFibonacci2(" + n +")");
		return n == 1 || n == 2 ? 1 : recursiveFibonacci2(n - 1) + recursiveFibonacci2(n - 2);
	}
}
