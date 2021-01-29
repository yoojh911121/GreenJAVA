import java.util.Arrays;

/*
Special Sort
출처 : http://www.careercup.com/question?id=5201559730257920

구글 전화면접 문제
n개의 정수를 가진 배열이 있다. 이 배열은 양의정수와 음의 정수를 모두 가지고 있다. 
이제 당신은 이 배열을 좀 특별한 방법으로 정렬해야 한다.
정렬이 되고 난 후, 음의 정수는 앞쪽에 양의정수는 뒷쪽에 있어야 한다. 
또한 양의정수와 음의정수의 순서에는 변함이 없어야 한다.

예. -1 1 3 -2 2 
ans: -1 -2 1 3 2.
 */
public class Ex02 {
	public static void main(String[] args) {
		ex01();
		ex02();
	}

	private static void ex02() {
		int[] ar = {-1,1,-3,3,-2,2,4}; // {-1, 1, 3, -2, 2};
		System.out.println("원본 : " + Arrays.toString(ar));
		int[] result = new int[ar.length];
		int index = 0;
		for(int i=0;i<ar.length;i++) 
			if(ar[i]<0)	result[index++] = ar[i];
		
		for(int i=0;i<ar.length;i++) 
			if(ar[i]>0)	result[index++] = ar[i];
		
		System.out.println("결과 : " + Arrays.toString(result));
	}
	private static void ex01() {
		int[] ar = {-1,1,-3,3,-2,2,4}; // {-1, 1, 3, -2, 2};
		System.out.println("원본 : " + Arrays.toString(ar));
		// 버블 정렬 알고리즘 이용
		for(int i=0;i<ar.length-1;i++) {
			for(int j=0;j<ar.length-1-i;j++) {
				if(ar[j]>0 && ar[j+1]<0) { // 현재 값이 양수이고 다음값이 음수이면 교환
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		System.out.println("결과 : " + Arrays.toString(ar));
	}
}
