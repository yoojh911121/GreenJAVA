import java.util.Arrays;
import java.util.Random;

public class BoubleSort {
	public static void main(String[] args) {
		Random rnd = new Random(); 		// 난수 객체
		int ar[] = new int[10];			// 배열 선언
		for(int i=0;i<ar.length;i++) {	// 배열을 난수로 초기화
			ar[i] = rnd.nextInt(101);
		}
		// boubleSort1(ar);
		// boubleSort2(ar);
		boubleSort3(ar);
	}
	
	public static void boubleSort3(int[] ar) { // 데이터의 교환이 없으면 정렬이 완료된것이다.
		System.out.println("원본 : " + Arrays.toString(ar));
		for(int i=0;i<ar.length-1;i++) { // N-1회전
			boolean flag = true; // 이미 정렬이 완료되었고 가정하자!!!
			for(int j=ar.length-1;j>i;j--) {
				if(ar[j]<ar[j-1]) {
					int temp = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = temp;
					flag = false; // 교환이 이루어 졌다면 아직 정렬중이다.
				}
			}
			if(flag) break; // flag값이 참이라면 교환을 1번하지 않았다 정렬이 안료되었다. 탈출!!!
			System.out.println((i+1) + "회전 : " + Arrays.toString(ar));
		}
		System.out.println("정렬 후 : " + Arrays.toString(ar));
	}
	
	public static void boubleSort2(int[] ar) { // 데이터의 교환이 없으면 정렬이 완료된것이다.
		System.out.println("원본 : " + Arrays.toString(ar));
		for(int i=0;i<ar.length-1;i++) { // N-1회전
			boolean flag = true; // 이미 정렬이 완료되었고 가정하자!!!
			for(int j=0;j<ar.length-1-i;j++) {
				if(ar[j]>ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					flag = false; // 교환이 이루어 졌다면 아직 정렬중이다.
				}
			}
			if(flag) break; // flag값이 참이라면 교환을 1번하지 않았다 정렬이 안료되었다. 탈출!!!
			System.out.println((i+1) + "회전 : " + Arrays.toString(ar));
		}
		System.out.println("정렬 후 : " + Arrays.toString(ar));
	}
	
	public static void boubleSort1(int[] ar) {
		System.out.println("원본 : " + Arrays.toString(ar));
		for(int i=0;i<ar.length-1;i++) { // N-1회전
			for(int j=0;j<ar.length-1-i;j++) {
				if(ar[j]>ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
			System.out.println((i+1) + "회전 : " + Arrays.toString(ar));
		}
		System.out.println("정렬 후 : " + Arrays.toString(ar));
	}
}
