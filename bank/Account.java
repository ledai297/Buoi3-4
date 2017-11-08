package samsung.java.week2.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	private String accountID;
	private String accountName;
	private long principal;
	private float interestRate;
	private String sentDate;
	public long interest;
	
	public Account(String accountID, String accountName, long principal, float interestRate, String sentDate) {
		super();
		this.accountID = accountID;
		this.accountName = accountName;
		this.principal = principal;
		this.interestRate = interestRate;
		this.sentDate = sentDate;
	}
	
	
	
	public long getInterest(int days) {
		return (long) ((long)principal*interestRate*days);
	}
	public void setInterest(long interest) {
		this.interest = interest;
	}
	
	
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public long getPrincipal() {
		return principal;
	}
	public void setPrincipal(long principal) {
		this.principal = principal;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public String getSentDate() {
		return sentDate;
	}
	public void setSentDate(String sentDate) {
		this.sentDate = sentDate;
	}
	
	
	
	
}
