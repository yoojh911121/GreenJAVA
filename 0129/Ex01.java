import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
사이냅소프트 면접문제
출처 : http://okjsp.net/bbs?seq=92230

주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.
이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌

1. 김씨와 이씨는 각각 몇 명 인가요?
2. "이재영"이란 이름이 몇 번 반복되나요?
3. 중복을 제거한 이름을 출력하세요.
4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
 */
public class Ex01 {
	static String[] data;
	
	static { // 정적 초기화 블록 : 정적멤버의 초기화가 복잡할때 사용한다.
		// 문자열.split(구분자) : 구분자로 분리해서 배열을 만들어 준다.
		data = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌".split(",");
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(data));
		exam01();
		exam02();
		System.out.println(Arrays.toString(exam3()));
		System.out.println(Arrays.toString(exam4()));
		System.out.println(Arrays.toString(exam5()));
	}
	
	private static Object[] exam5() {
		Set<String> treeSet = new TreeSet<>(); // 중복을 제거하고 정렬을 지원하는 자료구조
		for(int i=0;i<data.length-1;i++) {
			treeSet.add(data[i]);
		}
		return treeSet.toArray();
	}
	private static Object[] exam4() {
		Set<String> hashSet = new HashSet<>(); // 중복을 제거 지원하는 자료구조
		for(int i=0;i<data.length-1;i++) {
			hashSet.add(data[i]);
		}
		return hashSet.toArray();
	}
	
	private static String[] exam3() {
		String data2[] = new String[data.length];
		System.arraycopy(data, 0, data2, 0, data.length);
		for(int i=0;i<data2.length-1;i++) {
			if(data2[i].equals("")) continue; // 이름이 없으면 다음으로
			for(int j=i+1;j<data2.length;j++) { 
				if(data2[i].equals(data2[j])) { // 같은 이름이 있으면 이름을 공백으로치환
					data2[j]="";
				}
			}
		}
		int count = 0;
		for(int i=0;i<data2.length;i++) if(!data2[i].equals("")) count++; // 공백이 아닌 개수
		String result[] = new String[count]; // 배열선언
		int index = 0;
		for(int i=0;i<data2.length;i++) { // 공백이 아닌 값만 복사
			if(!data2[i].equals("")) {
				result[index] = data2[i];
				index++;
			}
		}
		return result;
	}
	private static void exam01() {
		int kimcCount=0, leecCount=0;
		for(int i=0;i<data.length;i++) {
			if(data[i].charAt(0)=='김') kimcCount++;
			if(data[i].startsWith("이")) leecCount++;  // startsWith("문자열") : 시작되는가?
		}
		System.out.println("김씨 " + kimcCount + "명");
		System.out.println("이씨 " + leecCount + "명");
	}
	private static void exam02() {
		int count=0;
		for(int i=0;i<data.length;i++) {
			if(data[i].equals("이재영")) count++; 
		}
		System.out.println("이재영씨 " + count + "명");
	}
}
