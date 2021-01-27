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
			studentData.add(new Student(file.next()+" "+file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), 0));
			}
		}
	public static void generateGPA()
		{
		
		}
	public static void letterNumberAssociation(String letter)
		{
		
		}
	}
