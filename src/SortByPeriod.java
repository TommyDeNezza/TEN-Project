import java.util.Comparator;
public class SortByPeriod implements Comparator<Student>
{
	public int compare (Student s1, Student s2)
	{
		if (MainMenu.periodSort==1)
			return s1.getClass1().compareTo(s2.getClass2());
		else if (MainMenu.periodSort==2)
			return s1.getClass2().compareTo(s2.getClass2());
		else 
			return s1.getClass3().compareTo(s2.getClass3());
	}
	
	
}

