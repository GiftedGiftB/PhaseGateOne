import java.util.Scanner;
public class CreaditCardValidation{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	String userInput;

	System.out.print("Enter creadit card: ");
	userInput = input.next();

	int length = userInput.length();
	
	System.out.println(length);

	char firstNumber = userInput.charAt(0);
	char secondNumber = userInput.charAt(1);
	System.out.println(firstNumber);
	
		
}

}