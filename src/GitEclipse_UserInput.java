import java.util.Scanner;

public class GitEclipse_UserInput {

	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);

	String answer;
	int age;
	
	System.out.println("What is your name?");
	answer = in.nextLine();
	
	System.out.println("How old are you?");
	age = Integer.parseInt(in.nextLine());
	
	System.out.println("Your name is " + answer + " and you are " + age + " years old.");
		
	}

}
