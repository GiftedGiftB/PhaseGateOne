import java.util.Scanner;
public class EcommerceCheckoutSystem{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("What is the customer's name: ");
	String customerName = input.next();

	System.out.print("What did the user buy: ");
	String userItems = input.next();

	System.out.print("How many pieces:");
	int pieces = input.nextInt();

	System.out.print("How much per unit: ");
	double perUnits = input.nextInt();

	//System.out.print("Add more items?: ");
	//int addItems = input.nextInt();

	
        double total = pieces * perUnits;
       
        System.out.println("Customer Name: " + customerName);
        System.out.println("Item: " + userItems);
        System.out.println("Quantity: " + pieces);
        System.out.println("Price: " + perUnits);
        System.out.println("Total: " + total);
       


}
}