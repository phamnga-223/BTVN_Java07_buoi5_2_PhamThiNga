package baiTap;

/**
 * Câu 3: Có bao nhiêu số chia hết cho 3 từ 0-1000 (While và For)
 */
public class Cau3 {

	public static void main(String[] args) {
		//Cách 1: Dùng while
		checkNumWhile(3, 1000);
		
		//Cách 2: Dùng For
		checkNumFor(3, 1000);
	}
	
	public static void checkNumWhile(int a, int n) {
		//B1: Kiểm tra số a
		if (a == 0) {
			System.out.println("Không thể đếm có bao nhiêu số chia hết cho 0!");
			return;
		}
		
		//B2: Đếm có bao nhiêu số chia hết cho 3
		int count = 0;
		int i = 0;
		while (i <= n) {
			if (i % 3 == 0) count++;	
			i++;
		}
		
		System.out.println("Kết quả: Có " + count + " số chia hết cho 3 từ 0-" + n);
	}
	
	public static void checkNumFor(int a, int n) {
		//B1: Kiểm tra số a
		if (a == 0) {
			System.out.println("Không thể đếm có bao nhiêu số chia hết cho 0!");
			return;
		}
		
		//B2: Đếm có bao nhiêu số chia hết cho 3
		int count = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0) {
				count++;
			}
		}
		
		System.out.println("Kết quả: Có " + count + " số chia hết cho 3 từ 0-" + n);
	}
}
