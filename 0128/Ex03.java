
public class Ex03 {
	public static void main(String[] args) {
		int a,b,c;
		a = b = 10;
		c = a + b;
		System.out.println(a + ", " + b + ", " + c); // 10, 10, 20
		
		a++;
		b++;
		c = a + b;
		System.out.println(a + ", " + b + ", " + c); // 11, 11, 22
		
		++a;
		++b;
		c = a + b;
		System.out.println(a + ", " + b + ", " + c); // 12, 12, 24
		// ++, --는 단독으로 사용 시 앞뒤 상관없다. ==> 1 증감
		
		
		c = a++ + ++b; // ++b; c = a+b; a++; 순서 대로 계산된다.
		System.out.println(a + ", " + b + ", " + c); // 13, 13, 25
		
		c = ++a + b++; // ++a;  c = a + b; b++;
		System.out.println(a + ", " + b + ", " + c); // 14, 14, 27
		
		 // c = ++++++a; // JAVA는 에러 C/C++은 됩니다.
		 // c = a++++++; // 모든 언어에서 에러!!!
		
		c = 5;
		c += 3;
		System.out.println(c);  // 8
		c *= 2;
		System.out.println(c);  // 16
		c *= 2 + 3; // 16 * (2 + 3) 일까요? 16 * 2 + 3일까요? ==> 복합 대입 연산자는 연산 순위가 제일 낮다. 우변이 먼저 계산된다.
		System.out.println(c);  // 80
		
		
		a = b = 10;
		c = a == b ? a++ : ++b; // 여기서 ++b는 계산되지 않는다.
		System.out.println(a + ", " + b + ", " + c); // 11, 10, 10 
		
		
		c = a==b && a==++b ? ++a : ++b; // 여기서 && 뒤의 a==++b 와 ++a는 계산되지 않는다.
		                                // &&(AND)연산의 경우 앞의 식이 거짓이면 뒤의 식은 계산하지 않는다.
		System.out.println(a + ", " + b + ", " + c); // 11, 11, 11
		
		c = a==b || a==++b ? ++a : ++b; // 여기서 || 뒤의 a==++b 와 ++b는 계산되지 않는다.
									    // ||(OR)연산의 경우 앞의 식이 참이면 뒤의 식은 계산하지 않는다.
		System.out.println(a + ", " + b + ", " + c); // 12, 11, 12
		
		
	}
}
