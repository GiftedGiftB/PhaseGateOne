import java.util.Scanner;
public class StudentGrade{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	System.out.print("Enter number of student: ");
	int numberOfStudent = input.nextInt();

	System.out.print("Enter number of subject: ");
	int numberOfSubject = input.nextInt();

	double[][] studentScore = new double[numberOfStudent][numberOfSubject];

System.out.print("""
Saving >>>>>>>>>>>>>>>>>>>>>>>>			    
Saved successfully

""");
	for (int row = 0; row < studentScore.length; row++){
		for (int column = 0; column < studentScore[row].length; column++){

		System.out.println("Entering score for student " + (row + 1));

		System.out.println("Entering score for subject " + (column + 1));
		while(true){
                System.out.print("Enter student score: ");
                studentScore[row][column] = input.nextDouble();
		
		if(studentScore[row][column] <= 100){	
			break;
		}
		else{
			System.out.println("Invalid input.Enter a score from 0 - 100");
		}
		}

System.out.print("""
Saving >>>>>>>>>>>>>>>>>>>>>>
Saved successfully

""");

	}
	
	}

System.out.println("=========================================================");
	System.out.print("STUDENT\t\t");
	
	for (int row = 0; row < numberOfStudent; row++){
		
		System.out.print("SUB " + (row + 1) + "\t");
	}
		System.out.print(" TOT\tAVE\t POS");
System.out.println("\n=========================================================");

	int total = 0;
	int average = 0;
	for (int column = 0; column < numberOfSubject; column++){

		System.out.print("\nStudent " + (column + 1));
		
	
	
	}
	System.out.print("\t" + studentScore(column + 1));
System.out.println("""
\n=====================================================
=======================================================
""");

	
}

}