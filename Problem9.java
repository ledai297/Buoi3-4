package samsung.java.hw1;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> studentList = new ArrayList<>();
		System.out.println("Nhap so sinh vien : ");
		int n = sc.nextInt();
		String s1,s2;
		for(int i=0;i<n;i++){
			System.out.println("Nhap ho ten sinh vien thu "+(i+1));
			s1= sc.nextLine();
			sc.nextLine();
			studentList.add(s1);
		}
		System.out.println("Nhap ho ten sinh vien can kiem tra: ");
		s2=sc.nextLine();
		for(int i=0;i<n;i++){
			if(s2.equalsIgnoreCase(studentList.get(i))){
				System.out.println("sinh vien: "+s2+" co nam trong danh sach");
			}
		}
	}

}
