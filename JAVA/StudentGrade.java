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
			Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			    
			Saved successfully

""");

	for(int row = 0; row < studentScore.length; row++){
		for(int column = 0; column < studentScore[row].length; column++){

	System.out.println("Entering score for student: " + (row + 1));

	System.out.println("Entering score for subject: " + (column + 1));
}
}

	System.out.println("Enter student score: ");
	int studentScore[row][column] = input.nextInt();
	System.out.print("""
			Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

			Saved successfully

""");



	




	
	/* for(int count = 0; count < numberOfStudent; count++){
		for(int counter = 0; counter < numberOfStudent; counter++){

	System.out.print("Enter student name: ");
	studentName[count] = input.next();
	
	System.out.print("Enter score: ");
	studentScore[count][counter] = input.nextDouble();
	}
	} */


}

}