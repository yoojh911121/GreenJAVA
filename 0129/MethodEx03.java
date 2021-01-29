/*
재귀 호출(recursive call)
-------------------------
자신이 자신을 호출하는 메서드. 반드시 종료식이 들어가야 한다.
잘쓰면 약!!!! 잘못쓰면 독!!!!
*/
public class MethodEx03 {
	public static void main(String[] args) {
		System.out.println(sum(100));
		System.out.println(recursiveSum(100));
		System.out.println(factorial(5));
		System.out.println(recursiveFactorial(5));
		// rf(5) ==> 5 * rf(4) ==> 5 * 4 * rf(3) ==> 5 * 4 * 3 * rf(2) ==> 5 * 4 * 3 * 2 * rf(1) ==>  5 * 4 * 3 * 2 * 1
		for(int i=1;i<=10;i++) {
			System.out.printf("2의 %d승 = %d\n", i, power(2, i));
		}
		for(int i=1;i<=10;i++) {
			System.out.printf("2의 %d승 = %d\n", i, recursivePower(2, i));
		}
		
		downUp1(5);
		System.out.println();
		downUp2(5);
		System.out.println();
		recursiveDownUp(5);
		System.out.println();
	}
	
	// 리턴값이 없는 재귀호출은?
	// 5를 넘기면 5 4 3 2 1 0 1 2 3 4 5 출력하는 메서드
	public static void downUp1(int n) {
		for(int i=n;i>=0;i--) System.out.print(i + " ");
		for(int i=1;i<=n;i++) System.out.print(i + " ");
	}
	// 위의 함수를 반복문 1개로 풀어라!!!
	public static void downUp2(int n) {
		int sw = -1, t = n;
		for(int i=0;i<n*2+1;i++) {
			System.out.print(t + " ");
			if(t==0) sw *= -1;// 반전시 시용하는 기법!!!!
			t += sw; // -1을 더하면 감소. +1을 더하면 증가!!!!
		}
	}
	// 위의 함수를 재귀호출로 만들어라!!!
	public static void recursiveDownUp(int n) {
		System.out.print(n + " ");
		if(n==0) return;
		recursiveDownUp(n-1);
		System.out.print(n + " ");
	}
	
	// x의 y승을 구하는 일반 메서드
	public static int power(int x, int y) {
		int result = 1;
		while(y>0) {
			result *= x;
			y--;
		}
		return result;
	}
	// x의 y승을 구하는 재귀호출 메서드
	public static int recursivePower(int x, int y) {
		return y<=1 ? x : x * recursivePower(x, y-1);
	}
	
	
	// n!을 구하는 일반 메서드
	// 5! = 5*4*3*2*1
	public static int factorial(int n) {
		int f = 1;
		while(n>0) f *= n--;
		return f;
	}
	// n!을 구하는 재귀호출 메서드
	public static int recursiveFactorial(int n) {
		return n<=1 ? 1 : n * recursiveFactorial(n-1);
	}
	
	// 1~n까지 합을 구하는 일반 메서드
	public static int sum(int n) {
		int s = 0;
		while(n>0) s += n--;
		return s;
	}
	// 1~n까지 합을 구하는 재귀호출 메서드
	public static int recursiveSum(int n) {
		return n<=0 ? 0 : n + recursiveSum(n-1);
	}
}
