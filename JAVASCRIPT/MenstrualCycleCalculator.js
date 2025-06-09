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

let ovulationDay = lastCycleStartDate + Math.floor(cycleLength / 2);

console.log("The length of your cycle is: " + cycleLength);

console.log("Your ovulation day is approximately on day: " + ovulationDay);
