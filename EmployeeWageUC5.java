public class EmployeeWageUC5{
	public static final int isFullTime=1;
	public static final int isPartTime=0;
	public static final int empRatePerHour=20;
	public static final int fullTimeHours=8;
	public static final int partTimeHours=4;
	public static void main(String[] args){
		int empWage=0;
		int empHours=0;
		int monthlyWage=0;
		int monthlyHours=0;
		int maxHours=50;
		int workingDays=0;
		for(workingDays=0; workingDays<=20; workingDays++){
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch(empCheck){
			case isFullTime:
			empHours=fullTimeHours;
			break;
			case isPartTime:
			empHours=partTimeHours;
			break;
			default:
			break;
			}
		empWage=(empHours*empRatePerHour);
		monthlyWage+=empWage;
		}
		System.out.println("Total Salary is :-"+monthlyWage);
	}
}
