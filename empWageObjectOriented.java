public class EmpWageObjectOriented
{
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
		public String company;
		public int empRatePerHr;
		public int numOfWorkingDays;
		public int maxWorkingHr;

		public EmpWageObjectOriented(String company,int empRatePerHr,int numOfWorkingDays,int maxWorkingHr)
		{
			this.company=company;
			this.empRatePerHr=empRatePerHr;
			this.numOfWorkingDays=numOfWorkingDays;
			this.maxWorkingHr=maxWorkingHr;
		}
		public static void computeEmpWage()
	{
                int empHr=0;
                int salary=0;
                int totalEmpWage=0;
                int empWage=0;
                int totalEmpHr=0;
                int totalWorkingDays=0;
                while(totalEmpHr<=maxWorkingHr && totalWorkingDays<=numOfWorkingDays)
                {
                        totalWorkingDays++;
                int Result=(int)(Math.random()*10)%3;

                        switch(Result)
                        {
                                case FULL_TIME:
                                        empHr=8;
                                        break;
                                case PART_TIME:
                                        empHr=4;
                                        break;
                                default:
                                        empHr=0;
                        }
                        empWage=empHr*empRatePerHr;
                        totalEmpWage+=empWage;

                }

                totalEmpWage=totalEmpWage*empRatePerHr;

                System.out.println("company :"+company+"Salary is :"+totalEmpWage);
	}
 	public static void main(String[] args)
	{
		empObjectOriented dmart=new empObjectOriented("Dmart",12,34,56);
		empObjectOriented reliance=new empObjectOriented("reliance",15,24,52);
		empObjectOriented tcs=new empObjectOriented("tcs",22,39,30);
		dmart.computeEmpWage();
		reliance.computeEmpWage();
		tcs.computeEmpWage();


	}

}
