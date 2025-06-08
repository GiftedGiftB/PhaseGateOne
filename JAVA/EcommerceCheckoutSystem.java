import java.util.Scanner;
public class EcommerceCheckoutSystem{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("What is the customer's name: ");
	String customerName = input.next();
	
while(addItems != -00){

	System.out.print("What did the user buy: ");
	String userItems = input.next();

	System.out.print("How many pieces:");
	int pieces = input.nextInt();

	System.out.print("How much per unit: ");
	double perUnits = input.nextInt();

	System.out.print("Add more items? (1 for yes and 0 for no): ");
	int addItems = input.nextInt();

	/* if(addItems == 0){
		break;
} */


        double total = pieces * perUnits;
        double valueAddedTax = total * 0.075;
        double totalWithVat = total + valueAddedTax;
}
        System.out.println("Customer Name: " + customerName);
        System.out.println("Item: " + userItems);
        System.out.println("Quantity: " + pieces);
        System.out.println("Price: " + perUnits);
        System.out.println("Total: " + total);
        System.out.println("The Value-added Tax (7.5%) is: " + valueAddedTax);
        System.out.println("Total with VAT: " + totalWithVat);
	System.out.print("THANK YOU FOR YOUR PATRONAGE");

}
}