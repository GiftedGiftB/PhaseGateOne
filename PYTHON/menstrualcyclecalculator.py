print("""

		Menstral cycle App

""")

userInput1;
userInput2;
userInput3;

lengthCycle;
	
temp = 0;
	
userInput1 = int(input("Enter current date at which your menstral cycle started: "));
	 
userInput2 = int(input("Enter last date of when you started your menstral cycle: "));	
	
userInput3 = int(input("Enter date you stoped menstrating: "));
	
if(userInput1 > userInput2){
	userInput1 = userInput2
}
elif (userInput1 < userInput2){
	Temp = userInput1;
	userInput1 = userInput2;
	userInput2 = Temp;
}

		lengthCycle = userInput1 - userInput2;
	
		ovulationDay = lengthCycle - 14;

		#safePeriod = 

			print("The length of your cycle is: " + lengthCycle);
			print("Your ovulation day is in: " + ovulationDay + " days");
			#print("Your safe period is: " + safePeriod " days after you've stoped menstrating");
