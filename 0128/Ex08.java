import java.util.Arrays;
import java.util.Random;

public class Ex08 {
	public static void main(String[] args) {
		Random rnd = new Random(); 		// 난수 객체
		int ar[] = new int[10];			// 배열 선언
		for(int i=0;i<ar.length;i++) {	// 배열을 난수로 초기화
			ar[i] = rnd.nextInt(101);
		}
		// 배열 출력
		System.out.println(Arrays.toString(ar));
		// 배열을 뒤집어라!!!
		int ar2[] = new int[ar.length]; // 똑 같은 크기의 배열을 만든다.
		System.arraycopy(ar, 0, ar2, 0, ar.length); // 배열 복사 : (원본, 시작위치, 사본, 시작위치, 몇개)
		for(int i=0;i<ar.length;i++) {	// 뒤에것을 앞으로 복사
			ar[i] = ar2[ar.length-i-1];
		}
		// 그리고 출력해라!!!
		System.out.println(Arrays.toString(ar));
		
		// 위의 임시 배열을 사용하지 말고 자체 만으로 뒤집어 보아라!!!!
		for(int i=0;i<ar.length/2;i++) {	// 뒤에것을 앞으로 복사
			ar[i] = ar[i] ^ ar[ar.length-1-i];
			ar[ar.length-1-i] = ar[i] ^ ar[ar.length-1-i];
			ar[i] = ar[i] ^ ar[ar.length-1-i];
		}
		
		// 그리고 출력해라!!!
		System.out.println(Arrays.toString(ar));
		
	}
}
