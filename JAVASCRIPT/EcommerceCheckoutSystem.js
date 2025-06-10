const prompt = require('prompt-sync')();

console.log()

console.log("		Semicolon Ecommerce Checkout System")



    let customerName = prompt("What is the customer's name: ");

    let userItems = prompt("What did the user buy: ");

    let pieces = parseInt(prompt("How many pieces: "));

    let perUnits = parseFloat(prompt("How much per unit: "));

    let total = pieces * perUnits;

    let valueAddedTax = total * 0.075;

    let totalWithVat = total + valueAddedTax;

   