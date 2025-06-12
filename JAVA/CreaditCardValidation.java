import java.util.Scanner;
public class CreaditCardValidation{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	String userInput;

	System.out.print("Enter creadit card: ");
	userInput = input.next();

	int length = userInput.length();
	//System.out.println(length);

	char firstNumber = userInput.charAt(0);
	char secondNumber = userInput.charAt(1);
	//System.out.println(firstNumber);
	
	if(length > 12 && length < 17){
		if (firstNumber == '4'){
		System.out.println("*******************************************");
		System.out.println("**Creadit Card Type: Visa Card");
		}
		else if (firstNumber == '5'){
		System.out.println("*******************************************");
		System.out.println("**Creadit Card Type: Master Card");
		}
		else if (firstNumber == '3' && secondNumber == '7'){
		System.out.println("*******************************************");
                System.out.println("**Creadit Card Type: American Express Card");
		}
		else if (firstNumber == '6'){
		System.out.println("*******************************************");
                System.out.println("**Creadit Card Type: Discover Card");
		}
		else{
		System.out.println("*******************************************");
		System.out.println("**Creadit Card Type: Not recognise");
		}
	System.out.println("**Creadit card Number: " + userInput);
	System.out.println("**Creadit Card digit length: " + length);

	System.out.println("**Cradit card validity status: Valid");
	}
	else{
	System.out.println("**Cradit card validity status: Invalid");
	}
	System.out.println("*******************************************");

	


	
}

}