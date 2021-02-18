import java.util.Scanner;

public class ChangeClasses {

	public static void changeClass() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please provide the first and last name of the student you would like to modify, separated by a space");
		System.out.println();
		String [] input = userInput.nextLine().split(" ");
		System.out.println("Now please input the class number you would like to modify: 1, 2, 3.");
		String classnum = userInput.nextLine();
		System.out.println();
		System.out.println("Please input the class you would like to add: ");
		String addC = userInput.nextLine();
		
		
		for(Student stu : StudentDataBank.studentData) {
			if(stu.getFName().equals(input[0]) && stu.getLName().equals(input[1])) {
				System.out.println("We have found the student you are looking for...");
				System.out.println();
				if(classnum.equals("1")) {
					System.out.println("You have chosen to drop the class:  " + stu.getClass1());
					System.out.println("You will replace it with:  " + addC);
					stu.setClass1(addC);
				}
				if(classnum.equals("2")) {
					System.out.println("You have chosen to drop the class:  " + stu.getClass2());
					System.out.println("You will replace it with:  " + addC);
					stu.setClass2(addC);
				}
				if(classnum.equals("3")) {
					System.out.println("You have chosen to drop the class:  " + stu.getClass3());
					System.out.println("You will replace it with:  " + addC);
					stu.setClass3(addC);
				}
				System.out.println("Please press enter to confirm your changes...  ");
				String blah = userInput.nextLine();
				break;
			}
		}
		
		
		
	
	}
	
}
