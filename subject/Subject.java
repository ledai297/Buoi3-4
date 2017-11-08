package samsung.java.week2.subject;

import java.util.ArrayList;

public class Subject {
	private String subjectID;
	private String subjectname;
	private int quota;
	private int currentEnrollment;
	public String getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public int getQuota() {
		return quota;
	}
	public void setQuota(int quota) {
		this.quota = quota;
	}
	public int getCurrentEnrollment() {
		return currentEnrollment;
	}
	public void setCurrentEnrollment(int currentEnrollment) {
		this.currentEnrollment = currentEnrollment;
	}
	public Subject(String subjectID, String subjectname, int quota, int currentEnrollment) {
		super();
		this.subjectID = subjectID;
		this.subjectname = subjectname;
		this.quota = quota;
		this.currentEnrollment = currentEnrollment;
	}
	
	public Subject(){
		
	}
	@Override
	public String toString() {
		return "Subject [subjectID=" + subjectID + ", subjectname=" + subjectname + ", quota=" + quota
				+ ", currentEnrollment=" + currentEnrollment + "]";
	}
	
	
	
	
	
	
}
