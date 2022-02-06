package com.oops.EmpWage;

public class EmpWageForEachCom {
	public static final int IS_FULL_TIME=1; 
	public static final int IS_PART_TIME=0;

	public static int companyWageDmart(){
		int wagePerHr=30; int workingDays=6;
		int workingHrPerMonth=150;
		int empHour = 0; 
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
	
	static int companyWageReliance(){
		int wagePerHr=20; 
		int workingDays=6;
		int workingHrPerMonth=180;
		int empHour = 0; 
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

		System.out.println("Employee Wage for dmart is "+companyWageDmart());
		System.out.println("Employee Wage for Reliance is "+companyWageReliance());
	}
}
