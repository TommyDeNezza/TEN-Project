import java.util.Scanner;
public class AddStudent {
	public static String fname;
	public static String lname;
	public static String class1;
	public static String grade1;
	public static String class2;
	public static String grade2;
	public static String class3;
	public static String grade3;
	
	
	public static void addStudent() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("You have selected to add a student. ");
		System.out.println("Please enter the first name of the student you would like to add: ");
		fname = userInput.nextLine();
		System.out.println("Last Name: ");
		lname = userInput.nextLine();
		System.out.println("Class 1: ");
		class1 = userInput.nextLine();
		System.out.println("Grade 1: ");
		grade1 = userInput.nextLine();
		System.out.println("Class 2: ");
		class2 = userInput.nextLine();
		System.out.println("Grade 2: ");
		grade2 = userInput.nextLine();
		System.out.println("Class 3: ");
		class3 = userInput.nextLine();
		System.out.println("Grade 3: ");
		grade3 = userInput.nextLine();
		System.out.println();
		System.out.println();
		StudentDataBank.add(fname, lname, class1, grade1, class2, grade2, class3, grade3, 0.0);
		
		System.out.println(fname + " " + lname + " has been added to the student data base.");
		
		
	}
	
}
