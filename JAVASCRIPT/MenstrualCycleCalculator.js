const prompt = require("prompt-sync")();

console.log("      Menstrual Cycle App  ");

let temp;

let lastCycleStartDate = Number(prompt("Enter last cycle start date (in days, e.g., 1-31): "));

let currentCycleStartDate = Number(prompt("Enter current cycle start date (in days, e.g., 1-31): "));

if (lastCycleStartDate > currentCycleStartDate) {
  temp = lastCycleStartDate;
  lastCycleStartDate = currentCycleStartDate;
  currentCycleStartDate = temp;
}

let cycleLength = currentCycleStartDate - lastCycleStartDate;


console.log("The length of your cycle is: " + cycleLength);

