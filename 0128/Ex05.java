/*
 * 비트 단위로 연산을 수행한다.
 * Shift 연산자 :  << , >> , >>>
 * 비트와이즈 연산자 : ~ , & , | , ^
 */
public class Ex05 {
	public static void main(String[] args) {
		int a = 3, b = 5;
										// 3   0011
		                                // 5   0101
		                                // &   0001 == > 1   ==> AND
		int c = a & b;
		System.out.println(c);
		
										// |   0111 == > 7   ==> OR
		c = a | b;
		System.out.println(c);

		
										// ^   0110 == > 6   ==> XOR : 두개 값이 다를때만 참 
		c = a ^ b;
		System.out.println(c);
		
		
		c = ~a;  // ~(NOT) : 1의 보수
		System.out.println(c);

		
		c = b + (~a+1);  // 1의 보수 + 1 = 2의 보수
		System.out.println(c);
		
	}
}
