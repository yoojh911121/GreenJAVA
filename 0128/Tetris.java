
public class Tetris {
	public static void main(String[] args) {
		int[] tetris = {0x0660, 0x6220, 0x2700,0x4620, 0x4444, 0x4460};
		
		for(int i=0;i<tetris.length;i++) {
			int mask = 0x8000;
			// 16진수를 2진수로 바꾸는 방법 
			for(int j=0;j<16;j++) {
				if((mask&tetris[i])==mask) {
					System.out.print(1);
					//System.out.print("■");
				}else {
					System.out.print(0);
					//System.out.print("  ");
				}
				if((j+1)%4==0) System.out.println(); // 4비트마다 줄바꾸기
				mask >>= 1;
			}
			System.out.println();
		}
	}
}
