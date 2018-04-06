import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_PayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your hourly rate: ");
		double hourlyRate = input.nextDouble();

		System.out.println("Enter the number of hours you worked this week: ");
		int numOfHoursWorked = input.nextInt();
	
	}

	private int numOfhoursWorked;
	private double hourlyRate, pay, overTime1;

	public double computePay(double hourlyRate, int numOfHoursWorked) {
	
		if(numOfhoursWorked>40)	{
	
			int overTime = numOfhoursWorked - 40;
			pay=(40*hourlyRate)+(overTime*hourlyRate);
	}
	else pay = numOfhoursWorked * hourlyRate;
	
	return pay;
	}

}
