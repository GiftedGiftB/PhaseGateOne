const prompt = require('prompt-sync')();

console.log()

console.log("		Semicolon Ecommerce Checkout System")


let isRunning = true;

let customerName = prompt("What is the customer's name: ");

//while (isRunning) {

	let userItems = prompt("What did the user buy: ");

	let pieces = parseInt(prompt("How many pieces: "));

	let perUnits = parseFloat(prompt("How much per unit: "));


	let total = pieces * perUnits;

	let valueAddedTax = total * 0.075;

	let totalWithVat = total + valueAddedTax;



	console.log("Customer Name: " + customerName);	

	console.log("Item: $" + userItems);

	console.log("Quantity: $" + pieces);

	console.log("Price: $" + perUnits);

	console.log("Total: $" + total);

	console.log("The Value-added Tax (7 .5%) is: $" + valueAddedTax);

	console.log("Total with VAT: $" + totalWithVat);

	let addItems = prompt("Add more items? (1 for yes and 0 for no): ");


 /*   if (addItems == 0){
        isRunning = false;
    }
} */

	console.log("THANK YOU FOR YOUR PATRONAGE");

