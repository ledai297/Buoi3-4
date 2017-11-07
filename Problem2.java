package samsung.java.hw1;

import java.util.Scanner;

public class Problem2 {
	public static double f(double x){
		return Math.tan(x*2)-x+1;
	}
	
	public static double derivative(double x){
		return 1/(Math.pow(Math.cos(x), 2))-1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ting gia tri f(x): ");
		System.out.println("Nhap x: ");
		double x = sc.nextDouble();
		System.out.println("f(x) = "+f(x)+"\n");
		System.out.println("f'(x) = "+derivative(x));
	}
}
