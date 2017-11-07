package samsung.java.hw1;

import java.util.Scanner;

public class Problem8 {
	
	public static int numberOfWords(String s){
		int count=0;
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++){
			if(a[i]==32) count++;
		}
		return count;
	}
	
	
	public static int numberOfCharacters(String s,char c){
		char[] a = s.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==c){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		String s=sc.nextLine();
		int numberOfWord=numberOfWords(s);
		System.out.println("Nhap ky tu can dem: ");
		char c= sc.next().charAt(0);
		int numberOfCharacters=numberOfCharacters(s, c);
		
		System.out.println("So tu cua chuoi la: "+numberOfWord);
		System.out.println("So ky tu '"+c+"' co trong chuoi la: "+numberOfCharacters);
	}

}
