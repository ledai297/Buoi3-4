package samsung.java.hw1;

import java.util.Scanner;

public class Problem7 {
	public static int[] sortOff(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	
	public static void displayArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ; ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Nhap phan tu thu "+i+" :");
			a[i]=sc.nextInt();
		}
		System.out.print("Mang chua sap xep la: \t");
		displayArray(a);
		a=sortOff(a);
		System.out.print("\nMang sau khi sap xep giam dan la: \t");
		displayArray(a);
		
		
	}
}
