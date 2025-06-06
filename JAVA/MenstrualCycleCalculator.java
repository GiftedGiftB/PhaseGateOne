import java.util.Scanner;
public class MenstrualCycleCalculator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("""

		Menstral cycle App

""");

	int userInput1;
	int userInput2;
	int lengthCycle;

	int Temp = 0;
	
	System.out.print("Enter current date at which your menstral cycle started: ");
	userInput1 = input.nextInt();

	System.out.print("Enter last date of when you started your menstral cycle: ");	
	userInput2 = input.nextInt();

	if(userInput1 > userInput2){
	userInput1 = userInput2;
	}
	else if (userInput1 < userInput2){
	Temp = userInput1;
	userInput1 = userInput2;
	userInput2 = Temp;
	}

	lengthCycle = userInput1 - userInput2;


	System.out.print("The length of your cycle is: " + lengthCycle);
	//System.out.println("Your ovulation day is: " + );


}
}