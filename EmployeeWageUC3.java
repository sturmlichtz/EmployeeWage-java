public class EmployeeWageUC3{
	public static void main(String[] args){
		int isFullTime=1;
		int isPartTime=0;
		int empRatePerHour=20;
		int empWage=0;
		int fullTimeHours=8;
		int partTimeHours=4;
		int empHours=0;
		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == isFullTime){
			System.out.println("Employee is Present");
			empHours=fullTimeHours;
		}
		else if (empCheck == isPartTime){
			System.out.println("Employee is Present for part time");
			empHours=partTimeHours;
		}
		else{
			System.out.println("Employee is absent");
		}
		empWage=(empHours*empRatePerHour);
		System.out.println("Salary is "+empWage);
	}
}
