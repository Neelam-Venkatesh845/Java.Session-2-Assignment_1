import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the age");
		int age = sc.nextInt();
		
		if (age >=18) {
		System.out.println("You are eligible to vote.");
	}
		System.out.println("Out of the if block");
	}

}
