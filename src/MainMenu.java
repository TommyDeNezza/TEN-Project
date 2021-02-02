import java.io.IOException;
import java.util.Scanner;


public class MainMenu {
	public static int input;
	public static int periodSort;
	public static void navigate() throws IOException {
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
			input = userInput.nextInt();
			if(input == 1) {
				AddStudent.addToTextFile();
			}
			if(input == 2) {
				// insert the delete student method here like above. 
			}

		}
		if(input == 2) {
			System.out.println("Change Student Grades/Schedule");
			System.out.println("1)   Change Grade");
			System.out.println("2)   Switch Classes");
			input = userInput.nextInt();
			if(input == 1) {
				//add the compile array list method here 
				// add the change grade method
			}
			if(input == 2) {
				//add the compile array list method here 
				// add the change classes method
				
			}
		}
		if(input == 3) {
			System.out.println("Sort Students");
			System.out.println("1)   Sort by last name");
			System.out.println("2)   Sort by GPA");
			System.out.println("3)   Sort by period");
			input = userInput.nextInt();
			if(input == 1) {
				//add the compile array list method here 
				// add the sort last name method
			}
			if(input == 2) {
				//add the compile array list method here 
				// add the sort gpa method
				
			}
			if(input == 3) {
				System.out.println("Sort by period");
				System.out.println("1)   first period");
				System.out.println("2)   second period");
				System.out.println("3)   third period");
				periodSort=userInput.nextInt();
			}
		}
		
		//Test comment - ignore
	}

}
