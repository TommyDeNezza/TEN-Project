import java.util.Scanner;

public class DeleteStudent {
	public static String nameInput;
	public static void deleteStudent() {
		Scanner userInput = new Scanner(System.in);
		System.out.println();
		System.out.println("You've selected to remove a student.");
		System.out.println("Please enter the first and last name of the student you would like to remove, separated by a space: ");
		nameInput = userInput.nextLine();
		String [] inputs = nameInput.split(" ");
		System.out.println();
		String firstName = inputs[0];
		String lastName = inputs [1];
		StudentDataBank.delete(firstName, lastName);
		
		
	}
}
