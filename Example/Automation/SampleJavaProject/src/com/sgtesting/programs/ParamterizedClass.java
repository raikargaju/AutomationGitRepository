package com.sgtesting.programs;

class Student
{
	Student(String fname,String branch,int rollno)
	{
		System.out.println("Student Full Name:"+fname);
		System.out.println("Student FBranch:"+branch);
		System.out.println("Student Roll Number:"+rollno);
	}
}
public class ParamterizedClass {

	public static void main(String[] args) {
		new Student("Karan M","Computer Science",1005);
	}
}