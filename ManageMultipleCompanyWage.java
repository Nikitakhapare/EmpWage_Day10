package com.oops.EmpWage;

public class ManageMultipleCompanyWage {
	public static final int IS_FULL_TIME=1; 
	public static final int IS_PART_TIME=0;

	private int noOfCompany=0;
	private CompanyEmpWage[] comEmpWagearr=new CompanyEmpWage[5];

	private void addCompanyEmpWage(String CompanyName,int wagePerHr, int workingDays, int workingHrPerMonth) {
		comEmpWagearr[noOfCompany]=new CompanyEmpWage(CompanyName,wagePerHr,workingDays,workingHrPerMonth);
		noOfCompany++;	
	}
	private void computeEmpWage() {
		int i;
		for(i = 0 ; i < noOfCompany ; i++) {
			comEmpWagearr[i].setTotalEmpWage(this.companyWage(comEmpWagearr[i]));
			System.out.println(comEmpWagearr[i]);
		}
	}
	public int companyWage(CompanyEmpWage a){
		int empHour = 0; 
		int workingHrPerMonth=0;
		int workingDays=0;
		int wagePerHr=0;
		int empCheck,empWage;
		while (workingDays < 0 && workingHrPerMonth<0) {
			empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			if(empCheck==IS_FULL_TIME)
				empHour=8;
			else if(empCheck==IS_PART_TIME)
				empHour=4;
			else
				empHour=0;
			workingDays += 1;
			workingHrPerMonth += empHour;
		}
		empWage = workingHrPerMonth * wagePerHr;
		return empWage;
	}

	public static void main(String[] args) {
		ManageMultipleCompanyWage a=new ManageMultipleCompanyWage();
		a.addCompanyEmpWage("D-mart", 20, 6, 120);
		a.addCompanyEmpWage("B-mart", 20, 7, 150);
		a.computeEmpWage();

	}


}


