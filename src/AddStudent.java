import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class AddStudent {
	
	public static void addToTextFile() throws IOException 
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Student First Name: ");
		String fname = userInput.nextLine();
		System.out.println("Student Last Name: ");
		String lname = userInput.nextLine();
		System.out.println("Student Class 1: ");
		String class1 = userInput.nextLine();
		System.out.println("Student Class 1 Grade: ");
		String grade1 = userInput.nextLine();
		System.out.println("Student Class 2: ");
		String class2 = userInput.nextLine();
		System.out.println("Student Class 2 Grade: ");
		String grade2 = userInput.nextLine();
		System.out.println("Student Class 3: ");
		String class3 = userInput.nextLine();
		System.out.println("Student Class 3 Grade: ");
		String grade3 = userInput.nextLine();
		
		
		
		BufferedWriter output;
		output = new BufferedWriter(new FileWriter("StudentList.txt", true));	
		output.newLine();
		output.append(fname + " "+ lname + " "+ class1 + " "+ grade1 + " "+ class2 + " "+ grade2 + " "+ class3 + " "+ grade3);
		output.close();
		
		
		}
	
}
