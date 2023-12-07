package com.sgtesting.paramiterizedconstructor;

class Student
{
	int StdNo;
	String StdName;
	int StdDYear;
	Student(int Sn,String Sname,int Sdy)
	{
		System.out.println("STUDENT DETAILS:");
		System.out.println("------------------------");
		StdNo = Sn;
		System.out.println("Student No: "+StdNo);
		StdName = Sname;
		System.out.println("Student Name: "+StdName);
		StdDYear = Sdy;
		System.out.println("Student Birth Year: "+StdDYear);
		System.out.println("************************");
	}
}

class Library
{
	int LibID;
	String BookName;
	String IssueM;
	Library(int Lid,String Bn,String Im)
	{
		System.out.println("LIBRARY DETAILS:");
		System.out.println("------------------------");
		LibID = Lid;
		System.out.println("Library ID: "+LibID);
		BookName = Bn;
		System.out.println("Book Name: "+BookName);
		IssueM = Im;
		System.out.println("Issueed Month: "+IssueM);
		System.out.println("************************");
	}
}

class Sports
{
	int SptID;
	String SptType;
	String SptName;
	Sports(int Sid,String St,String Sn)
	{
		System.out.println("SPORTS DETAILS:");
		System.out.println("------------------------");
		SptID = Sid;
		System.out.println("Sports ID: "+SptID);
		SptType = St;
		System.out.println("Sports Type: "+SptType);
		SptName = Sn;
		System.out.println("Sports Name: "+SptName);
		System.out.println("************************");
	}
}

class CSDepartment
{
	int CSDeptNo;
	String CSDeptName;
	String CSDeptDay;
	CSDepartment(int Csdn,String Csdname,String Csdd)
	{
		System.out.println("CS Department DETAILS:");
		System.out.println("------------------------");
		CSDeptNo = Csdn;
		System.out.println("CS Department ID: "+CSDeptNo);
		CSDeptName = Csdname;
		System.out.println("CS Department Name: "+CSDeptName);
		CSDeptDay = Csdd;
		System.out.println("Sports Name: "+CSDeptDay);
		System.out.println("************************");
	}
}

public class OrderClassForStudentLibrarySportsCSDepartment {

	public static void main(String[] args) {
		// Order Class For Student Library Sports CSDepartment
		new Student(31,"Kiran",1999);
		new Library(32,"Python Basics","Nov");
		new Sports(33,"Indore","Chess");
		new CSDepartment(34,"CPS","Mon");
	}
}