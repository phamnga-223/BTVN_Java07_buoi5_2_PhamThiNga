package baiTap;

/**
 * Câu 1: In tất cả số nguyên dương lẻ/chẵn < 100 ( Viết cả while và for )
 * Dùng bước nhảy và dùng % 2
 */
public class Cau1 {

	public static void main(String[] args) {
		//Cách 1: Dùng For
		inSoLeFor(100);
		
		//Cách 2: Dùng While
		inSoLeWhile(100);
	}
	
	public static void inSoLeFor (int n) {
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " - ");
			}
		}
		System.out.println();
	}
	
	public static void inSoLeWhile (int n) {
		int i = 0;
		while (i < n) {
			if (i % 2 != 0) {
				System.out.print(i + " - ");
			}
			i++;
		}
	}
	
}
