import java.util.*;
import java.io.*;
public class Student
	{
	String fName;
	String lName;
	String class1;
	String grade1;
	String class2;
	String grade2;
	String class3;
	String grade3;
	double gpa;
	public Student(String fn, String ln, String c1, String g1, String c2, String g2, String c3, String g3, double g)
		{
		fName = fn;
		lName = ln;
		class1 = c1;
		grade1 = g1;
		class2 = c2;
		grade2 = g2;
		class3 = c3;
		grade3 = g3;
		gpa = g;
		}
	public String getFName()
		{
		return fName;
		}
	public void setFName(String name)
		{
		this.fName = name;
		}
	public String getLName()
		{
		return lName;
		}
	public void setLName(String name)
		{
		this.lName = name;
		}
	public String getClass1()
		{
		return class1;
		}
	public void setClass1(String class1)
		{
		this.class1 = class1;
		}
	public String getGrade1()
		{
		return grade1;
		}
	public void setGrade1(String grade1)
		{
		this.grade1 = grade1;
		}
	public String getClass2()
		{
		return class2;
		}
	public void setClass2(String class2)
		{
		this.class2 = class2;
		}
	public String getGrade2()
		{
		return grade2;
		}
	public void setGrade2(String grade2)
		{
		this.grade2 = grade2;
		}
	public String getClass3()
		{
		return class3;
		}
	public void setClass3(String class3)
		{
		this.class3 = class3;
		}
	public String getGrade3()
		{
		return grade3;
		}
	public void setGrade3(String grade3)
		{
		this.grade3 = grade3;
		}
	public double getGpa()
		{
		return gpa;
		}
	public void setGpa(double gpa)
		{
		this.gpa = gpa;
		}
	}