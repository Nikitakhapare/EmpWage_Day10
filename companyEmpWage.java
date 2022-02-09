package com.oops.EmpWage;

public class CompanyEmpWage {
	public static final int IS_FULL_TIME=1; 
	public static final int IS_PART_TIME=0;
	public String companyName;
	public int workingDays ; 
	public int workingHrPerMonth ;
	public int wagePerHr;
	public int totalEmpWage;

	CompanyEmpWage(String CompanyName,int wagePerHr, int workingDays, int workingHrPerMonth ){
		this.companyName=CompanyName;
		this.workingDays=workingDays;
		this.wagePerHr=wagePerHr;
		this.workingHrPerMonth=workingHrPerMonth;
	}

	public void setTotalEmpWage(int empWage) {
		this.totalEmpWage=empWage;
	}

}
