import java.util.Scanner;


public class MainMenu {
	public static int input;
	public static void main(String[] args) {
		
		navigate();

	}
	public static void navigate() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What would you like to do?");
		System.out.println("1)   Add or delete a student");
		System.out.println("2)   Change student grades/schedule");
		System.out.println("3)   Sort students");
		
		input = userInput.nextInt();
		if(input == 1) {
			System.out.println("Add or Delete a Student");
			System.out.println("1)   Add a student");
			System.out.println("2)   Delete a student");
		}
		if(input == 2) {
			System.out.println("Change Student Grades/Schedule");
			System.out.println("1)   Change Grade");
			System.out.println("2)   Switch Classes");
		}
		if(input == 3) {
			System.out.println("Sort Students");
			System.out.println("1)   Sort by last name");
			System.out.println("2)   Sort by GPA");
			System.out.println("3)   Sort by period");
		}
	}

}
