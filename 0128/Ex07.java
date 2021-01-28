/*
 * 비트 단위로 연산을 수행한다.
 * Shift 연산자 :  << , >> , >>>
 * 비트와이즈 연산자 : ~ , & , | , ^
 */
public class Ex07 {
	public static void main(String[] args) {
		// 색상을 분리해 보자!!!
		// color는 int타입이다. 1바이트씩 : alpha, red, green, blue
		// 0xAARRGGBB
		int color = 0xAABBCCDD;
		// 0으로 AND연산을 하면 지우기이다.
		// 1로 AND연산을 하면 통과이다.
		int alpha = color >> 24 & 0xFF;
		System.out.println("Alpha : " + Integer.toHexString(alpha));

		int red = color >> 16 & 0xFF;
		System.out.println("Red : " + Integer.toHexString(red));

		int green = color >> 8 & 0xFF;
		System.out.println("Green : " + Integer.toHexString(green));
		
		int blue = color & 0xFF;
		System.out.println("Blue : " + Integer.toHexString(blue));
		
		// 색상을 결합해 보자!!!
		// 1로 OR연산을 하면 설정이다.
		// 0으로 OR연산을 하면 통과이다.
		int color2 = 0;
		System.out.println("Color2 : " + Integer.toHexString(color2));
		color2 = color2 | alpha << 24;
		System.out.println("Color2 : " + Integer.toHexString(color2));
		color2 = color2 | red << 16;
		System.out.println("Color2 : " + Integer.toHexString(color2));
		color2 = color2 | green << 8;
		System.out.println("Color2 : " + Integer.toHexString(color2));
		color2 = color2 | blue;
		System.out.println("Color2 : " + Integer.toHexString(color2));
		
		// Red값만 지워보자!!!
		color2  = color2 & 0xFF00FFFF;
		System.out.println("Color2 : " + Integer.toHexString(color2));
		
		// Red 값을 0x37로 변경해보자!!!
		color2  = color2 | 0x00370000;
		System.out.println("Color2 : " + Integer.toHexString(color2));
		
		
		
	}
}
