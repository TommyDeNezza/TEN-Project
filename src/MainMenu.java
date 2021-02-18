import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;


public class MainMenu 
	{
	public static int input;
	public static int periodSort;
	public static void navigate() throws IOException 
		{
		Scanner userInput = new Scanner(System.in);
		boolean navigating = true;
		StudentDataBank.CompileArray();
		while(navigating)
			{
			System.out.println("What would you like to do?");
			System.out.println("1)   Add or delete a student");
			System.out.println("2)   Change student grades/schedule");
			System.out.println("3)   Sort students");
			input = userInput.nextInt();
			if(input == 1) 
				{
				System.out.println("Add or Delete a Student");
				System.out.println("1)   Add a student");
				System.out.println("2)   Delete a student");
				int input1 = userInput.nextInt();
				if(input1 == 1) 
					{
					AddStudent.addStudent();
					}
				if(input1 == 2) 
					{
					DeleteStudent.deleteStudent();
					}
				}
			if(input == 2)
				{
				System.out.println("Change Student Grades/Schedule");
				System.out.println("1)   Change Grade");
				System.out.println("2)   Switch Classes");
				int input1 = userInput.nextInt();
				if(input1 == 1) 
					{
					ChangeGrade.changeGrade();
					StudentDataBank.generateGPA();
					PrintNames.printNames();	
					}
				if(input1 == 2)
					{
					StudentDataBank.generateGPA();
					ChangeClasses.changeClass();
					PrintNames.printNames();
					}
				}
			if(input == 3)
				{
				System.out.println("Sort Students");
				System.out.println("1)   Sort by last name");
				System.out.println("2)   Sort by GPA");
				System.out.println("3)   Sort by period");
				int input1 = userInput.nextInt();
				if(input1 == 1) 
					{
					StudentDataBank.generateGPA();
					Collections.sort(StudentDataBank.studentData, new SortByLastName());
					PrintNames.printNames();
					}
				if(input1 == 2) 
					{
					StudentDataBank.generateGPA();
					Collections.sort(StudentDataBank.studentData, new SortByGPA());
					PrintNames.printNames();
					}
				if(input1 == 3) 
					{
					System.out.println("Which period would you like to use in order to sort the student... ");
					System.out.println("1, 2, 3");
					int intput = userInput.nextInt();
					StudentDataBank.generateGPA();
					
					if(intput == 1) {
						Collections.sort(StudentDataBank.studentData, new SortByPeriod());
					}
					if(intput == 2) {
						Collections.sort(StudentDataBank.studentData, new SortByPeriod2());
					}
					if(intput == 3) {
						Collections.sort(StudentDataBank.studentData, new SortByPeriod3());
					}
					
					PrintNames.printNames();
					
					}
				}
			}
		}
	}
