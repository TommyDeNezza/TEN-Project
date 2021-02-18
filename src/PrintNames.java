
public class PrintNames
	{
	public static void printNames()
		{
		int i = 1;
		for(Student s: StudentDataBank.studentData)
			{
			System.out.println(i+": Name: "+s.getFName()+ " "+s.getLName()+"    GPA: "+s.getGpa()+"		Class 1: "+ s.getClass1()+" "+s.getGrade1()+"   Class 2: "+s.getClass2()+" "+s.getGrade2()+"   Class 3: "+s.getClass3()+ " "+s.getGrade3());
			System.out.println();
			i++;
			}
		}
	}
