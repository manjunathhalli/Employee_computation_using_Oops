package employewage;

import java.util.Random;


	public class EmpWage {

		static int isFullTime, isPartTime;
		static int empRatePerHr;
		static int empHrs;
		static int numberOfWorkingDays;
		static int maxHrsinMonth;

		public EmpWage(int f,int p,int r,int n,int m)
		{
			this.isFullTime=f;
			this.isPartTime=p;
			this.empRatePerHr=r;
			this.numberOfWorkingDays=n;
			this.maxHrsinMonth=m;
		}

		public static void main(String[] args) {

			Random num = new Random ();
			int totalSalary=0;
			int totalEmpHrs=0;
			int totalWorkingDays=0;
			EmpWage s1= new EmpWage (1,2,20,20,100);

			while (totalEmpHrs<=100 && totalWorkingDays<20)
			{
				totalWorkingDays++;

				int empCheck =num.nextInt(3);
				switch (empCheck) 
				{
				case 1:
					empHrs=8;
					break;
				case 2:
					empHrs=4;
					break;
				default:
					empHrs=0;
				}
				totalEmpHrs+=empHrs;

			}
			 totalSalary=totalEmpHrs*20;

			 System.out.println("Total employee Hours in a Month is "+totalEmpHrs);
		         System.out.println("Employee's Monthly Salary is "+totalSalary);

		}

}
