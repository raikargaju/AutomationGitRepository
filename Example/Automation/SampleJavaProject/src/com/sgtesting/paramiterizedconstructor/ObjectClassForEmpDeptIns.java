package com.sgtesting.paramiterizedconstructor;

class Employees
{
	int EmpID;
	String EmpName;
	int EmpPhone;
	int EmpSalary;
	Employees(int Eid,String Epn,int Ep,int Esry)
	{
		System.out.println("EMPLOYEE DETAILS:");
		System.out.println("------------------------");
		EmpID = Eid;
		System.out.println("Employee ID: "+EmpID);
		EmpName = Epn;
		System.out.println("Employee Name: "+EmpName);
		EmpPhone = Ep;
		System.out.println("Employee Phone: "+EmpPhone);
		EmpSalary = Esry;
		System.out.println("Employee Salary: "+EmpSalary);
		System.out.println("************************");
	}
}

class Department
{
	int DeptID;
	String DeptName;
	String DeptLocation;
	String DeptFloor;
	Department(int Did,String Dn,String Dl,String Df)
	{
		System.out.println("DEPARTMENT DETAILS:");
		System.out.println("------------------------");
		DeptID = Did;
		System.out.println("Department ID: "+DeptID);
		DeptName = Dn;
		System.out.println("Department Name: "+DeptName);
		DeptLocation = Dl;
		System.out.println("Department Location: "+DeptLocation);
		DeptFloor = Df;
		System.out.println("Department Floor: "+DeptFloor);
		System.out.println("************************");
	}
}

class Insurance
{
	int InsNo;
	String InsType;
	int InsYear;
	int InsAmt;
	Insurance(int In,String It,int Iy,int Ia)
	{
		System.out.println("INSURANCE DETAILS:");
		System.out.println("------------------------");
		InsNo = In;
		System.out.println("Insurance Number: "+InsNo);
		InsType = It;
		System.out.println("Insurance Type: "+InsType);
		InsYear = Iy;
		System.out.println("Insurance Date: "+InsYear);
		InsAmt = Ia;
		System.out.println("Insurance Amount: "+InsAmt);
		System.out.println("************************");
	}
}

public class ObjectClassForEmpDeptIns {

	public static void main(String[] args) {
		// Object class For Employee Department Insurance
		new Employees(11,"Ravi M",2589645,25000);
		new Department(12,"Java Lab","Bangalore","First Floor");
		new Insurance(13,"Life",2020,250000);
	}
}