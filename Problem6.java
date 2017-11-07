package samsung.java.hw1;

import java.util.Scanner;

public class Problem6 {
	
	public static long fibonacci(int n){
		if(n==0||n==1) return 1;
		else return fibonacci(n-1)+fibonacci(n-2); 
	}
	
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int n;
		System.out.println("Nhap n: ");
		n=sc.nextInt();
		long f= fibonacci(n);
		System.out.println("F("+n+") = "+f);
	}

}
