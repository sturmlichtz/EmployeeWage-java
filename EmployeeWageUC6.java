public class EmployeeWageUC6{
	public static final int isFullTime=1;
	public static final int isPartTime=0;
	public static final int empRatePerHour=20;
	public static final int fullTimeHours=8;
	public static final int partTimeHours=4;
	public static final int maxHours=100;
	public static final int maxDays=20;
	public static void main(String[] args){
		int empWage=0;
		int empHours=0;
		int monthlyWage=0;
		int monthlyHours=0;
		int workingDays=0;
		while (monthlyHours<=maxHours || workingDays<=maxDays){
				int empCheck = (int) Math.floor(Math.random()*10)%3;
				workingDays++;
				switch(empCheck){
				case 1:
				empHours=fullTimeHours;
				monthlyHours+=empHours;
				break;
				case 0:
				empHours=partTimeHours;
				monthlyHours+=empHours;
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
