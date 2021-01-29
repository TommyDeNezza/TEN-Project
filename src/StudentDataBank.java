import java.util.*;
import java.io.*;
public class StudentDataBank
	{
	static ArrayList<Student> studentData = new ArrayList<Student>();
	public static void CompileArray() throws IOException
		{
		Scanner file = new Scanner(new File("StudentList.txt"));
		for(int i = 0; i < 24; i++)
			{
			studentData.add(new Student(file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), 0));
			}
		}
	public static void generateGPA()
		{
		
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
	}
