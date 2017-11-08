package samsung.java.week2.subject;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		SubjectMethod sm = new SubjectMethod();
		boolean status=true;
		do{
			sm.displayMenu();
			String choose;
			choose=sc.nextLine();
			char chooseChar=choose.charAt(0);
			switch (chooseChar) {
			case '1': {
				System.out.println("Nhap ma mon hoc : ");
				String subjectID= sc.nextLine();
				System.out.println("Nhap ten mon hoc: ");
				String subjectName = sc.nextLine();
				System.out.println("Nhap so sinh vien toi da: ");
				int quota = sc.nextInt();
				System.out.println("Nhap so sinh vien da dang ky : ");
				int currentEnrollment=sc.nextInt();
				sm.appendSubject(new Subject(subjectID, subjectName, quota, currentEnrollment));
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
			case '2' :{
				System.out.println("Nhap ma mon hoc muon update: ");
				String subjectID=sc.nextLine();
				System.out.println("Nhap ma moi : ");
				String newSubjectID = sc.nextLine();
				System.out.println("Nhap ten moi : ");
				String newSubjectName = sc.nextLine();
				System.out.println("Nhap so sinh vien toi da: ");
				int newQuota=sc.nextInt();
				System.out.println("Nhap so sinh vien da dang ky : ");
				int newCurrentEnrollment=sc.nextInt();
				sm.updateSubject(subjectID, newSubjectName, newSubjectID, newQuota, newCurrentEnrollment);
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
				System.out.println("Nhap ma mon hoc : ");
				String subjectID=sc.nextLine();
				sm.displaySubject(subjectID);
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
				System.out.println("Nhap ma mon hoc : ");
				String subjectID = sc.nextLine();
				sm.enrolStudent(subjectID);
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
				System.out.println("Nhap ma mon hoc: ");
				String subjectID= sc.nextLine();
				sm.unenrolStudent(subjectID);
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
			choose=sc.nextLine();
		}while(status);
	}
}
