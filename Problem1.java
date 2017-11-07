package samsung.java.hw1;

import java.util.Scanner;

public class Problem1 {
	
	public static double f(double x){
		double A=(Math.log10(Math.pow(x, 2)+1))+Math.sqrt(Math.pow(x,4)+1);
		double B = Math.pow(x, 2)-x+1;
		return A/B;
		
	}
	
	
	public static double g(double x, double y){
		return Math.cos(2*x)+Math.pow(y, 2)-y+1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tinh f(x):");
		System.out.println("Nhap x: ");
		double x=sc.nextDouble();
		double f=f(x);
		System.out.println("f(x) = "+ f+"\n" );
		
		System.out.println("Tim g(x,y)");
		
		System.out.println("Nhap x: ");
		x=sc.nextDouble();
		System.out.println("Nhap y: ");
		double y = sc.nextDouble();
		double g=g(x,y);
		System.out.println("g(x) = "+g);
	}
}
