import java.util.Comparator;
public class SortByLastName implements Comparator<Student> {
public int compare (Student s1, Student s2)
	{
	return s1.getLName().compareTo(s2.getLName());
	}
}
