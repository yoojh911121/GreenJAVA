
public class MethodEx01 {
	public static void main(String[] args) {
		line();
		System.out.println("재미없는 자바");
		line(13);
		
		System.out.println("진짜 재미없는 자바");
		line(18, '^');

		System.out.println("정말정말 재미없는 자바");
		line("*", 22);
		line();
	}
	// 메서드 오버로딩 : 메서드의 이름을 동일하게 여러개 만들어 사용한다.
	//                   반드시 인수의 개수나 타입이 달라야 한다.
	private static void line(int count, String ch) {
		for(int i=0;i<count;i++) System.out.print(ch);
		System.out.println();
	}
	private static void line(int count, char ch) {
		for(int i=0;i<count;i++) System.out.print(ch);
		System.out.println();
	}
	private static void line(String ch, int count) {
		for(int i=0;i<count;i++) System.out.print(ch);
		System.out.println();
	}
	private static void line(char ch, int count) {
		for(int i=0;i<count;i++) System.out.print(ch);
		System.out.println();
	}
	private static void line(String ch) {
		for(int i=0;i<80;i++) System.out.print(ch);
		System.out.println();
	}
	private static void line(char ch) {
		for(int i=0;i<80;i++) System.out.print(ch);
		System.out.println();
	}
	private static void line(int count) {
		for(int i=0;i<count;i++) System.out.print("~");
		System.out.println();
	}
	private static void line() {
		for(int i=0;i<80;i++) System.out.print("~");
		System.out.println();
	}
}
