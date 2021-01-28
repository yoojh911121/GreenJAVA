/*
*        # 모든 비트가 1인 수 : 11111111 =>  2진수
                              	377      =>  8진수
                              	FF       => 16진수
                              	255      => 10진수
 */
public class Ex02 {
	public static void main(String[] args) {
		int a = 0xFF;				// 숫자가 0x로 시작하면 16진수
		int b = 0377;				// 숫자가 0로 시작하면 8진수
		int c = 0b11111111;			// 숫자가 0b로 시작하면 16진수  ==> JDK 1.7이상만 지원!!!
		int d = 255;				// 숫자가 1~9로 시작하면 10진수
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		a = 0x10;
		b = 010;
		c = 0b10;
		d = 10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);		
		
		int i=255;
		System.out.println(i);  // 10진수 출력
		System.out.println( Integer.toBinaryString(i));  // 2진수 출력
		System.out.println( Integer.toOctalString(i));  // 8진수 출력
		System.out.println( Integer.toHexString(i));  // 16진수 출력
	}
}
