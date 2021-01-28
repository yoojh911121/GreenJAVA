import java.util.Arrays;
import java.util.Random;

// 선택 정렬
public class SelectionSort {
	public static void main(String[] args) {
		Random rnd = new Random(); // 난수 객체
		int ar[] = new int[5]; // 배열 선언
		for (int i = 0; i < ar.length; i++) { // 배열을 난수로 초기화
			ar[i] = rnd.nextInt(101);
		}
		// 배열 출력
		System.out.println("정렬전 : " + Arrays.toString(ar));
		
		selectionSort(ar);
		selectionSort2(ar);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
	}

	private static void selectionSort2(int[] ar) {   // 이 메서드가 완전한 선택정렬이다.
		int min;
		int size = ar.length;
		for (int i = 0; i < size - 1; i++) { // size-1 : 마지막 요소는 자연스럽게 정렬됨
			min = i; // 피신
			for (int j = i + 1; j < size; j++) {
				if (ar[min] > ar[j]) {
					min = j; // 적은값의 위치를 저장한다.
				}
			}
			// 끝까지 돈다음에 1번 교환
			int temp = ar[min];
			ar[min] = ar[i];
			ar[i] = temp;
			System.out.println((i + 1) + "회전 : " + Arrays.toString(ar));
		}
		System.out.println("정렬후 : " + Arrays.toString(ar));
	}

	private static void selectionSort(int[] ar) {
		for (int i = 0; i < ar.length - 1; i++) { // n-1회전

			for (int j = i + 1; j < ar.length; j++) { // i+1 ~ n까지 반복
				// 조건문을 여기에 두면 최악의 경우(역순으로 되어있을 경우) 1번 반복할때 반복횟수 만큼 교환이 일어날수 있다.
				// 9 8 7 6 5 4 3 2 1
				// if(ar[i]>ar[j]) { // 현재 값이 비교값보다 크다면 교환
				if (ar[i] < ar[j]) { // 현재 값이 비교값보다 적으면 교환
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;

				}
			}
			System.out.println((i + 1) + "회전 : " + Arrays.toString(ar));
		}
		System.out.println("정렬후 : " + Arrays.toString(ar));
	}
}
