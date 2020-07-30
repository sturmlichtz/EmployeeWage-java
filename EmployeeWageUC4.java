public class EmployeeWageUC4{
	public static final int isFullTime=1;
	public static final int isPartTime=0;
	public static final int empRatePerHour=20;
	public static final int fullTimeHours=8;
	public static final int partTimeHours=4;
	public static void main(String[] args){
		int empWage=0;
		int empHours=0;
		int empCheck = (int) Math.floor(Math.random()*10)%3;
		switch(empCheck){
		case 1:
		System.out.println("Employee is Present");
		empHours=fullTimeHours;
		break;
		case 0:
		System.out.println("Employee is Present for part time");
		empHours=partTimeHours;
		break;
		default:
		System.out.println("Employee is Absent");
		break;
		}
		empWage=(empHours*empRatePerHour);
		System.out.println("Salary is :-"+empWage);
	}
}
