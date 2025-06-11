import java.util.Scanner;
class MbtiTest {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("""

			MBTI Personality Test
""");
		
		String judgingPerceiving = getJudgingPerceiving();
		String extraversionIntroversion = getExtraversionIntroversion();
		String thinkingFeeling = getThinkingFeeling();
		String sensingIntuition = "S";
	
		String personalityType = sensingIntuition + extraversionIntroversion + thinkingFeeling + judgingPerceiving;

		System.out.println("Your personality type is: " + personalityType);
    }

	public static String getJudgingPerceiving() {
		System.out.println("When working on a project, what motivates you more?");
		System.out.println("A. Breaking down the task into smaller, manageable parts and creating a schedule.");
		System.out.println("B. Brainstorming new ideas and exploring different possibilities.");
		System.out.print("Enter your choice (A/B): ");
		String choice = input.next().toUpperCase();
		return choice.equals("A") ? "J" : "P";
    }

	public static String getExtraversionIntroversion() {
		System.out.println("In social situations, how do you typically feel?");
		System.out.println("A. Energized and enthusiastic, enjoying the company of others.");
		System.out.println("B. Reserved and reflective, preferring to observe before contributing.");
		System.out.print("Enter your choice (A/B): ");
		String choice = input.next().toUpperCase();
		return choice.equals("A") ? "E" : "I";
    }

	public static String getThinkingFeeling() {
		System.out.println("When making decisions, what do you prioritize?");
		System.out.println("A. Logical analysis and objective criteria.");
		System.out.println("B. Personal values and the impact on others.");
		System.out.print("Enter your choice (A/B): ");
        	String choice = input.next().toUpperCase();
		return choice.equals("A") ? "T" : "F";
    }
	
}

