package samsung.java.hw1;

import java.util.Scanner;

public class Problem10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tau bi theo doi: ");
		int n= sc.nextInt();
		int[][] array = new int[n][3];
		for(int i=0;i<n;i++){
			System.out.println("\nNhap thong tin tau thu "+(i+1)+ " :");
			System.out.println("Nhap ma chu quyen(1 hoac -1) :");
			array[i][0]=sc.nextInt();
			System.out.println("Nhap tung do y : ");
			array[i][1]=sc.nextInt();
			System.out.println("Nhap hoanh do x :");
			array[i][2]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if((array[i][0]==-1&&array[i][1]<150)||(array[i][0]==-1&&array[i][2]<150)){
				System.out.print("Toa do tau xam pham chu quyen: ");
				System.out.println("\t y = "+array[i][1]+" ; x = "+array[i][2]);
			}
			
		}
	}

}
