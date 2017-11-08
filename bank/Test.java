package samsung.java.week2.bank;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		SavingAccouont function=new  SavingAccouont();
		do{
			function.displayMenu();
			String choose;
			choose=sc.nextLine();
			switch (choose.charAt(0)) {
			case '1':{
				System.out.println("\t\t THEM TAI KHOAN");
				System.out.println("Nhap so tai khoan: ");
				String accountID= sc.nextLine();
				System.out.println("Nhap ten tai khoan :");
				String accountName=sc.nextLine();
				System.out.println("Nhap tien goc: ");
				long principal=sc.nextLong();
				System.out.println("Nhap lai suat: ");
				float interestRate=sc.nextFloat();
				System.out.println("Nhap ngay gui(dd/MM/yyyy)");
				sc.nextLine();
				String sentDate=sc.nextLine();
				Account newAccount=new Account(accountID, accountName, principal, interestRate, sentDate);
				function.appendAccount(newAccount);
				System.out.println("Press Enter to continue...");
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sc.nextLine();
				break;
			}
			case '2':{
				System.out.println("\t\tRUT TIEN LAI");
				System.out.println("Nhap so tai khoan muon rut tien :");
				String accountID= sc.nextLine();
				function.withdrawInterest(accountID);
				System.out.println("Press Enter to continue...");
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sc.nextLine();
				break;
			}
			case '3':{
				System.out.println("\t\t RUT MOT PHAN GOC");
				System.out.println("Nhap ten tai khoan :");
				String accountID=sc.nextLine();
				System.out.println("Nhap so tien muon rut:");
				long money=sc.nextLong();
				sc.nextLine();
				function.partialyWithdraw(money, accountID);
				System.out.println("Press Enter to continue...");
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sc.nextLine();
				break;
			}
			case '4':{
				System.out.println("\t\t RUT TOAN BO TAI KHOAN");
				System.out.println("Nhap so tai khoan : ");
				String accountID=sc.nextLine();
				function.totallyWithdraw(accountID);
				System.out.println("Press Enter to continue...");
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sc.nextLine();
				break;
			}
			case '5':{
				System.out.println("\t\tGUI TIEN");
				System.out.println("Nhap tai khoan muon gui tien : ");
				String accountID=sc.nextLine();
				System.out.println("Nhap so tien muon gui :");
				long money=sc.nextLong();
				sc.nextLine();
				function.deposit(accountID, money);
				System.out.println("Press Enter to continue...");
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sc.nextLine();
				break;
			}
			case '6':{
				System.out.println("Nhap tai khoan muon xem thong tin :");
				String accountID=sc.nextLine();
				function.displayAccount(accountID);
				System.out.println("Press Enter to continue...");
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sc.nextLine();
				break;
			}

			default:
				System.out.println("Bye bye");
				status=false;
				break;
			}
			
		}while(status);
	}
}
