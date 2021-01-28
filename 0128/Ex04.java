/*
 * 비트 단위로 연산을 수행한다.
 * Shift 연산자 :  << , >> , >>>
 * 비트와이즈 연산자 : ~ , & , | , ^
 */
public class Ex04 {
	public static void main(String[] args) {
		int i = 2;                      // 10
		System.out.println(i); // 2
		i = i << 1; 					// 100
		System.out.println(i); // 4
		i = i << 1; 					// 1000
		System.out.println(i); // 8
		i = i << 2; 					// 100000
		System.out.println(i); // 32    // n << m  = n * 2의 m승
		i = i << 3; 					// 100000
		System.out.println(i); // 256   // n << m  = n * 2의 m승
		i >>= 1; 
		System.out.println(i); // 128
		i >>= 1; 
		System.out.println(i); // 64
		i >>= 2; 
		System.out.println(i); // 16   // n >> m  = n / 2의 m승
		System.out.println();
		
		i = 32;
		i >>= 1;
		System.out.println(i); // 16
		i = 32;
		i >>>= 1;
		System.out.println(i); // 16  // 양수의 경우는  >> , >>> 결과가 같다.
		System.out.println();
		
		i = -32;
		i >>= 1;
		System.out.println(i); // -16    // 부호비트는 밀리지 않는다.
		i = -32;
		i >>>= 1;
		System.out.println(i); // 2147483632  // 음수의 경우는  >> , >>> 결과가 다르다.
	}
}
