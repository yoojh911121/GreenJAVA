/*
 * 비트 단위로 연산을 수행한다.
 * Shift 연산자 :  << , >> , >>>
 * 비트와이즈 연산자 : ~ , & , | , ^
 */
public class Ex06 {
	public static void main(String[] args) {
		int a = 3, b = 5;
		System.out.println(a + ", " + b);
		// 위 두개의 변수값을 교환하시오!!!!
		// 1. 임시 변수를 사용하는 방법
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + ", " + b);
		// 2. 임시 변수를 사용하지 말고 해결하기!!!!   
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + ", " + b);		
		/*
	    a		3    0011
		b       5    0100
		a       7    0111
		b       3    0011
		a       5    0100 
		 */
		
	}
}
