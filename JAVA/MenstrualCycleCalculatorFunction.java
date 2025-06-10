 public MenstrualCycleCalculatorFunction{
	

	public static int MenstrualCycleCalculator(){


	if(userInput1 > userInput2){
		userInput1 = userInput2;
		}
	else if (userInput1 < userInput2){
		Temp = userInput1;
		userInput1 = userInput2;
		userInput2 = Temp;
		}

		lengthCycle = userInput1 - userInput2;
	
		int ovulationDay = lengthCycle - 14;

	}



}