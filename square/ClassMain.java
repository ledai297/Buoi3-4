package samsung.java.week2.square;

import java.util.Scanner;

public class ClassMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap do dai canh hinh vuong : ");
		float a = sc.nextFloat();
		Square square = new Square(a);
		System.out.println("Hien thi do dai canh :");
		square.displayEdge();
		System.out.println("Hien thi chu vi: ");
		square.getPerimeter();
		System.out.println("Hien thi dien tich : ");
		square.getArea();
		System.out.println("Hien thi toan bo thong tin : ");
		square.displayAll();
	}

}
