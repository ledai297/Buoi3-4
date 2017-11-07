package samsung.java.hw1;

import java.util.Scanner;

public class Problem4 {
	
	public static double function1(double x){
		return Math.sin(x*2)+Math.pow(x, 2);
	}
	public static double function2(double x){
		return 2*Math.cos(2*x)+2*x;
	}
	public static double function3(double a,double b){
		return Math.sin(b*2)+Math.pow(b, 2)-Math.sin(a*2)-Math.pow(a, 2);
	}
	
	public static void displayMenu(){
		System.out.println("\n");
		System.out.println("Function:  f(x)=sin(2*x) + x^2");
		System.out.println("1.  Calculate f(x) at x");
		System.out.println("2.  Calculate f'(x) at x");
		System.out.println("3.  Solve equation f(x) = 0 at [a,b]");
		System.out.println("Press another key to quit");
		
	}
	
	
	public static void main(String[] args) {
		boolean exit=true;
		do{
			Problem4.displayMenu();
			
			String choose;
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap lua chon: ");
			choose=sc.nextLine();
			switch (choose) {
			case "1":
			{
				System.out.println("Nhap x: ");
				double x = sc.nextDouble();
				double f = function1(x);
				System.out.println("f(x) = "+f);
				break;
			}
			
			case "2":
			{
				System.out.println("Nhap x ");
				double x = sc.nextDouble();
				double f2=function2(x);
				System.out.println("f'(x) = "+f2);
				break;
			}
			
			case "3":
			{
				System.out.println("Nhap a: ");
				double a=sc.nextDouble();
				System.out.println("Nhap b: ");
				double b= sc.nextDouble();
				double f3 = function3(a, b);
				System.out.println("Gia tri cua f(x) tren doan ["+a+" ; "+b+"] la: "+f3 );
				break;
			}
			default:
				
			{	
				System.out.println("Tam biet!!");
				exit=false;
				break;
			}
			}
		}while(exit);
	}
}
