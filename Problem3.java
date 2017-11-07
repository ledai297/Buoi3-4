package samsung.java.hw1;

import java.util.Scanner;

public class Problem3 {
	public static long fee(int numberOfElect) {
		long fee;
		if (numberOfElect < 0)
		{
			System.out.println("Nhap sai so dien.");
			return -1;
		}
		if (numberOfElect > 0 && numberOfElect < 25)
			fee = numberOfElect * 1000;
		else if (numberOfElect >= 25 && numberOfElect < 75) {
			fee = numberOfElect * 1250;
		} else if (numberOfElect > 75 && numberOfElect < 150) {
			fee = numberOfElect * 1800;
		} else
			fee = numberOfElect * 2500;

		return fee;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long fee;
		do{
			System.out.println("Nhap so dien : ");
			int x =sc.nextInt();
			fee= fee(x);
			if(x>0){
				System.out.println("So tien phai tra la: "+fee);
			}
		}while(fee==-1);
	}
}
