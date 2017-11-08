package samsung.java.week2.subject;

import java.util.ArrayList;

public class SubjectMethod {

	static ArrayList<Subject> subjects = new ArrayList<>(50);

	public static void enrolStudent(String subjectID) {

		Subject subject = findSubject(subjectID);
		if (subject != null) {
			if (subject.getCurrentEnrollment() < subject.getQuota()) {
				subject.setCurrentEnrollment(subject.getCurrentEnrollment() + 1);
				System.out.println("Ghi danh sinh vien thanh cong.");
				System.out.println("So luong sinh vien da dang ky la: " + subject.getCurrentEnrollment());
			}
		}

	}

	public static void unenrolStudent(String subjectID) {
		Subject subject = findSubject(subjectID);
		if (subject != null) {
			if (subject.getCurrentEnrollment() < subject.getQuota()) {
				subject.setCurrentEnrollment(subject.getCurrentEnrollment() - 1);
				System.out.println("Xoa sinh vien thanh cong.");
				System.out.println("So luong sinh vien da dang ky la: " + subject.getCurrentEnrollment());
			}
		}
	}

	public static void appendSubject(Subject subject) {
		if (checkSubjectID(subject.getSubjectID())) {
			subjects.add(subject);
			System.out.println("Them mon hoc thanh cong!");
		} else {
			System.out.println("Trung ma mon hoc!!!!!!");
		}
	}

	public static void updateSubject(String subjectID, String newSubjectName, String newSubjectID, int newQuota,
			int newCurrentEnrollment) {
		Subject subject = findSubject(subjectID);
		if (checkSubjectID(newSubjectID) == true) {
			subject.setSubjectname(newSubjectName);
			subject.setSubjectID(newSubjectID);
			subject.setQuota(newQuota);
			subject.setCurrentEnrollment(newCurrentEnrollment);
			System.out.println("Update mon hoc thanh cong.");
		}
	}

	public static void displaySubject(String subjectID) {
		Subject subject = findSubject(subjectID);
		if (subject != null) {
			System.out.println("THONG TIN MON HOC: ");
			System.out.println("Ten mon hoc: " + subject.getSubjectname());
			System.out.println("Ma mon hoc: " + subject.getSubjectID());
			System.out.println("So sinh vien toi da : " + subject.getQuota());
			System.out.println("So sinh viein da dang ky : " + subject.getCurrentEnrollment());
		}
	}

	public static void displayMenu() {
		System.out.println("\tSUBJECT MANAGER SYSTEM");
		System.out.println("---------------------------------------");
		System.out.println(" 1.Append new subject");
		System.out.println(" 2.Update subject");
		System.out.println(" 3.Display the information of subject");
		System.out.println(" 4.Enrol new student");
		System.out.println(" 5.Unenrol student");
		System.out.println("Yout choice ( 1-5, other to quit)");

	}

	public static Subject findSubject(String subjectID) {
		for (Subject s : subjects) {
			if (subjectID.equals(s.getSubjectID()))
				return s;
		}
		return null;
	}

	public static boolean checkSubjectID(String subjectID) {

		for (int i = 0; i < subjects.size(); i++) {
			if (subjects.get(i).getSubjectID().equals(subjectID)) {
				return false;// co trong list r thif tra ve false
			}
		}
		return true;// chua co tra ve true
	}
}
