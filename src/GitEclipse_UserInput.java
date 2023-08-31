import java.util.Scanner;

public class GitEclipse_UserInput {

	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);

	int answer1;
	int answer2;
	int sum;
	
	System.out.println("First number?");
	answer1 = Integer.parseInt(in.nextLine());	
	
	System.out.println("Second number?");
	answer2 = Integer.parseInt(in.nextLine());
	
	sum = answer1 + answer2;
	
	System.out.println(answer1 + " + " + answer2 + " = " + sum);
	
	}

}
