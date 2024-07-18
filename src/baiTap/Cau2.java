package baiTap;

import java.util.Scanner;

/**
 * Câu 2: Tính tổng các số chẵn từ 1 đến n
 * Với n nhập từ người dùng (While và For)
 */
public class Cau2 {

	public static void main(String[] args) {
		//B1: Người dùng nhập n
		Scanner scanner = new Scanner(System.in);
		System.out.println("Xin vui lòng nhập số n:");
		int n = scanner.nextInt();
		if (n <= 0) {
			System.out.println("Số n không hợp lệ!");
			return;
		}
		
		//Cách 1: Dùng While
		tongWhile(n);
		
		//Cách 2: Dùng For
		tongFor(n);
	}
	
	public static void tongWhile (int n) {
		int sum = 0;
		int i = 0;
		while (i <= n) {
			sum += i;
			i += 2;
		}
		
		System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + sum);
	}
	
	public static void tongFor (int n) {
		int sum = 0;
		for (int i = 0; i <= n; i += 2) {
			sum += i;
		}
		
		System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + sum);
	}
}
