import java.util.Scanner;

public class GitEclipse_UserInput {

	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);

	String answer;
	
	System.out.println("What is your name?");
	answer = in.nextLine();
	
	
	if (answer.isEmpty())
	{
		System.out.println("Error");
	} else {
		System.out.println("Your name is " + answer + ".");
		}
		
		
	}

}
