import java.util.*;
import java.io.*;
public class RunnerClass
	{
	public static void main(String[] args) throws IOException
		{
		StudentDataBank.CompileArray();
		System.out.println(StudentDataBank.studentData.get(0).getGpa());
		MainMenu.navigate();
		}
	}
