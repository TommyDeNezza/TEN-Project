import java.util.Scanner;

public class ChangeGrade {

	public static void changeGrade() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please provide the first and last name of the student you would like to modify, separated by a space");
		System.out.println();
		String [] input = userInput.nextLine().split(" ");
		System.out.println("Now please input the class number of the grade you would like to modify: 1, 2, 3.");
		String classnum = userInput.nextLine();
		System.out.println();
		System.out.println("Please input the grade you would like to add: ");
		String addC = userInput.nextLine();
		
		
		for(Student stu : StudentDataBank.studentData) {
			if(stu.getFName().equals(input[0]) && stu.getLName().equals(input[1])) {
				System.out.println("We have found the student you are looking for...");
				System.out.println();
				if(classnum.equals("1")) {
					System.out.println("You have chosen to change the grade:  " + stu.getGrade1());
					System.out.println("You will replace it with:  " + addC);
					stu.setGrade1(addC);
				}
				if(classnum.equals("2")) {
					System.out.println("You have chosen to change the grade:  " + stu.getGrade2());
					System.out.println("You will replace it with:  " + addC);
					stu.setGrade2(addC);
				}
				if(classnum.equals("3")) {
					System.out.println("You have chosen to change the grade:  " + stu.getGrade3());
					System.out.println("You will replace it with:  " + addC);
					stu.setGrade3(addC);
				}
				System.out.println("Please press enter to confirm your changes...  ");
				String blah = userInput.nextLine();
				break;
			}
		}
		
		
		
	
	}
	
}
