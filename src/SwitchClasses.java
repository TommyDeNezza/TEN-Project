import java.util.Scanner;

public class SwitchClasses
	{
	static Scanner userInput = new Scanner(System.in);
	public static void switchClass()
		{
		System.out.println("What student would you like to alter classes for?");
		String student = userInput.nextLine();
		for(int i = 0; i < StudentDataBank.studentData.size(); i++)
			{
			if(student.equals(StudentDataBank.studentData.get(i).getFName()))
				{
				System.out.println("What class? (enter period number)");
				String numb = userInput.nextLine();
				if(numb.equals("1"))
					{
					System.out.println("What would you like to change the class to?");
					String grade = userInput.nextLine();
					StudentDataBank.studentData.get(i).setClass1(grade);
					System.out.println("Here's the new list:");
					}
				else if(numb.equals("2"))
					{
					System.out.println("What would you like to change the class to?");
					String grade = userInput.nextLine();
					StudentDataBank.studentData.get(i).setClass2(grade);
					System.out.println("Here's the new list:");
					}
				else if(numb.equals("3"))
					{
					System.out.println("What would you like to change the class to?");
					String grade = userInput.nextLine();
					StudentDataBank.studentData.get(i).setClass3(grade);
					System.out.println("Here's the new list:");
					}
				}
			}
		}
	}
