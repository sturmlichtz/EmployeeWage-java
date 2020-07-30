public class EmployeeWageUC2{
	public static void main(String[] args){
		int isFullTime=1;
		int empRatePerHour=20;
		int empWage=0;
		int fullTimeHours=8;
		int empHours=0;
		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == isFullTime){
			System.out.println("Employee is Present");
			empHours=fullTimeHours;
		}
		else{
			System.out.println("Employee is absent");
		}
		empWage=(empHours*empRatePerHour);
		System.out.println("Salary is "+empWage);
	}
}
