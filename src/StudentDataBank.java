import java.util.*;
import java.io.*;
public class StudentDataBank
	{
	static ArrayList<Student> studentData = new ArrayList<Student>();
	public static void CompileArray() throws IOException
		{
		Scanner file = new Scanner(new File("StudentList.txt"));
		while(file.hasNext())
			{
			studentData.add(new Student(file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), 0));
			}
		generateGPA();
		}
	public static void generateGPA()
		{
		for(Student s: studentData)
			{
			double tempGPA = 0;
			tempGPA += letterNumberAssociation(s.getGrade1());
			tempGPA += letterNumberAssociation(s.getGrade2());
			tempGPA += letterNumberAssociation(s.getGrade3());
			tempGPA /= 3;
			s.setGpa((Math.round(tempGPA*100))/100.0);
			}
		}
	public static double letterNumberAssociation(String l)
		{
		switch(l)
			{
			case "A", "A+":
			return 4;
			case "A-":
			return 3.7;
			case "B+":
			return 3.3;
			case "B":
			return 3;
			case "B-":
			return 2.7;
			case "C+":
			return 2.3;
			case "C":
			return 2;
			case "C-":
			return 1.7;
			case "D+":
			return 1.3;
			case "D":
			return 1;
			case "D-":
			return 	0.7;		
			case "F":
			return 0;
			}
		return 0;
		}
	public static void add(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, double d) {
		studentData.add(new Student(s, s1, s2, s3, s4, s5, s6, s7, d));
	}
	
	public static void delete(String s, String s1) {
		int i = 0;
		for(Student student : studentData) {
			System.out.println(i);
			System.out.println(student.getFName());
			if(student.getFName().equals(s) && student.getLName().equals(s1)){
				studentData.remove(student);
				break;
			}
			i++;
		}
		System.out.println("You have removed : "+ s + " " + s1);
	}
	}
