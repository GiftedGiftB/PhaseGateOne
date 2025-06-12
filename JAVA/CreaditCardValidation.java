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
	
	if (length > 12 && length < 17) {
            System.out.println("Valid");
            if (firstNumber == '4') {
                System.out.println("Visa Card");
            } else if (firstNumber == '5') {
                System.out.println("Master Card");
            } else if (firstNumber == '3' && secondNumber == '7'){
                System.out.println("American Express Card");
            } else if (firstNumber == '6') {
                System.out.println("Discover Card");
            } else {
                System.out.println("Not recognise");
            }
        } else {
            System.out.println("Invalid");
        }

	
}

}