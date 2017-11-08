package samsung.java.week2.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SavingAccouont {
	static ArrayList<Account> accounts=new ArrayList<>();
	
	public static void appendAccount(Account newAccount){
		if(checkAccountID(newAccount.getAccountID())){
			accounts.add(newAccount);
			System.out.println("Them tai khoan thanh cong.");
		}
		else{
			System.out.println("So tai khoan bi trung!!!");
		}
		
	}
	
	public void displayMenu(){
		System.out.println("\t\tBank Managerment System");
		System.out.println("---------------------------");
		System.out.println("1. Append new account");
		System.out.println("2. Withdraw interest");
		System.out.println("3. Partialy withdraw");
		System.out.println("4. Totally withdraw");
		System.out.println("5. Deposit");
		System.out.println("6. Display information");
		System.out.println("Your choice (1-6, other to quit):");
	}
	public void displayAccount(String accountID){
		Account account = findAccount(accountID);
		if(account==null){
			System.out.println("Tai khoan khong ton tai!!!");
			
		}
		else{
			int days=getDays(account);
			System.out.println("\tSo tai khoan    : "+account.getAccountID());
			System.out.println("\tten tai khoan   : "+account.getAccountName());
			System.out.println("\tTien goc        : "+account.getPrincipal());
			System.out.println("\tNgay gui        : "+account.getSentDate());
			System.out.println("\tTien lai(x.y)   : "+account.getInterest(days));
			System.out.println(days);
		}
	}
	
	public void deposit(String accountID,long money){
		
		Account account = findAccount(accountID);
		if(account==null){
			System.out.println("Tai khoan khong ton tai!!!");
			
		}
		else{
			account.setPrincipal(account.getPrincipal()+money);
			System.out.println("So tien trong tai khoan cua ban la: "+account.getPrincipal());
			Date nowDate=new Date();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			String dateString = format.format(nowDate);
			account.setSentDate(dateString);
		}
		
	}
	
	public static void partialyWithdraw(long money,String accountID){
		
		Account account = findAccount(accountID);
		if(account==null){
			System.out.println("Tai khoan khong ton tai!!!");
			
		}
		else{
			if(account.getPrincipal()<money){
				System.out.println("Khong du tien de rut!!!");
			}
			else{
				int days=getDays(account);
				System.out.println("So tien rut dc la: "+(account.getInterest(days)+money));
				System.out.println("So tien con lai trong tai khoan la: "+(account.getPrincipal()-money));
				Date nowDate=new Date();
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				String dateString = format.format(nowDate);
				account.setSentDate(dateString);
				account.setPrincipal(account.getPrincipal()-money);
			}
			
		}
		
	}
	
	public static void totallyWithdraw(String accountID){
		Account account = findAccount(accountID);
		if(account==null){
			System.out.println("Tai khoan khong ton tai!!!");
			
		}
		else{
			int days=getDays(account);
			System.out.println("Tong so tien rut duoc la: "+(account.getInterest(days)+account.getPrincipal()));
			Date nowDate=new Date();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			String dateString = format.format(nowDate);
			account.setSentDate(dateString);
			account.setInterest(0);
			account.setPrincipal(0);
		}
	}
	
	
	public static void withdrawInterest(String accountID){
		Account account = findAccount(accountID);
		if(account==null){
			System.out.println("Tai khoan khong ton tai!!!");
			
		}
		else{
			int days=getDays(account);
			System.out.println("Tien lai da rut la: "+account.getInterest(days));
			Date nowDate=new Date();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			String dateString = format.format(nowDate);
			account.setSentDate(dateString);
			account.setInterest(0);
		}
		
	}
	
	public static boolean checkAccountID(String accountID){
		for(Account acc : accounts){
			if(accountID.equals(acc.getAccountID())){
				return false;
			}
		}
		return true;
		
	}
	
	public static Account findAccount(String accountID){
		for(Account acc : accounts){
			if(accountID.equals(acc.getAccountID())){
				return acc;
			}
		}
		return null;
	}
	
	
	public static int getDays(Account account){
		String sentDate = account.getSentDate();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = format.parse(sentDate);
			Date nowDate= new Date();
			int days=(int)((nowDate.getTime()-date.getTime())/(1000*60*60*24));
			return days;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
