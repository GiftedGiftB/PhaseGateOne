import java.util.Scanner;
public class MenstrualCycleCalculator {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int Temp;
	int lastCycleStartDate;
	int currentCycleStartDate;
	int cycleLength;

	System.out.print("Enter last cycle start date (in days, e.g., 1-31): ");
	lastCycleStartDate = input.nextInt();

	System.out.print("Enter current cycle start date (in days, e.g., 1-31): ");
	currentCycleStartDate = input.nextInt();

	if(lastCycleStartDate > currentCycleStartDate){
		lastCycleStartDate = lastCycleStartDate;
		}
	else if (lastCycleStartDate < currentCycleStartDate){
		Temp = lastCycleStartDate;
		lastCycleStartDate = currentCycleStartDate;
		currentCycleStartDate = Temp;
		}


	cycleLength = currentCycleStartDate - lastCycleStartDate;

	int ovulationDay = lastCycleStartDate + cycleLength / 2;

	System.out.println("The length of your cycle is: " + cycleLength);

	System.out.println("Your ovulation day is approximately on day: " + ovulationDay);


	int safePeriodStart = ovulationDay + 2; 

	int safePeriodEnd = lastCycleStartDate + cycleLength; 

	System.out.println("Your safe period is approximately from day " + safePeriodStart + " to day " + safePeriodEnd);


}
}

