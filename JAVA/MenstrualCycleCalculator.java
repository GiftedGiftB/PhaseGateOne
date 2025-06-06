import java.util.Scanner;
public class MenstrualCycleCalculator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int userInput1;
	int userInput2;
	
	System.out.print("Enter current date at which your menstral cycle started: ");
	userInput1 = input.nextInt();

	System.out.print("Enter last date of when you started your menstral cycle: ");	
	userInput2 = input.nextInt();

	int cycle = userInput1 - userInput2;

	System.out.print("The length of your cycle is: " + cycle);

}
} 