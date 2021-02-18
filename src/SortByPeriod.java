import java.util.Scanner;
import java.util.Comparator;
public class SortByPeriod implements Comparator<Student>
{
	public int compare (Student s1, Student s2) {
		return s1.getClass1().compareTo(s2.getClass1()); 
		
	}

		
	
	
}
