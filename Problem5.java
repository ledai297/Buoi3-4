package samsung.java.hw1;

import java.util.Scanner;

public class Problem5 {
	public static long giaiThua(int n) {
		int f;

		for (f = 1; n > 1; n--)
			f *= n;

		return f;

	}

	public static int nCr(int n, int r) {
		return (int) (giaiThua(n) / (giaiThua(n - r) * giaiThua(r)));
	}

	public static void main(String args[]) {
		int n, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap kich thuoc n: ");
		n=sc.nextInt();

		System.out.print("Tam giac Pascal:\n\n");
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= n - i; j++)
				System.out.print("  ");

			for (j = 0; j <= i; j++)
				System.out.format(" %3d", nCr(i, j));

			System.out.println("");
		}

	}
}
