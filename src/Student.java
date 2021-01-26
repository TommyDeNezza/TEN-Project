import java.util.*;
import java.io.*;
public class Student
	{
	String name;
	String class1;
	String class2;
	String class3;
	String grade1;
	String grade2;
	String grade3;
	double gpa;
	public Student(String n, String c1, String c2, String c3, String g1, String g2, String g3, double g)
		{
		name = n;
		class1 = c1;
		class2 = c2;
		class3 = c3;
		grade1 = g1;
		grade2 = g2;
		grade3 = g3;
		gpa = g;
		}
	protected String getName()
		{
		return name;
		}
	protected void setName(String name)
		{
		this.name = name;
		}
	protected String getClass1()
		{
		return class1;
		}
	protected void setClass1(String class1)
		{
		this.class1 = class1;
		}
	protected String getClass2()
		{
		return class2;
		}
	protected void setClass2(String class2)
		{
		this.class2 = class2;
		}
	protected String getClass3()
		{
		return class3;
		}
	protected void setClass3(String class3)
		{
		this.class3 = class3;
		}
	protected String getGrade1()
		{
		return grade1;
		}
	protected void setGrade1(String grade1)
		{
		this.grade1 = grade1;
		}
	protected String getGrade2()
		{
		return grade2;
		}
	protected void setGrade2(String grade2)
		{
		this.grade2 = grade2;
		}
	protected String getGrade3()
		{
		return grade3;
		}
	protected void setGrade3(String grade3)
		{
		this.grade3 = grade3;
		}
	protected double getGpa()
		{
		return gpa;
		}
	protected void setGpa(double gpa)
		{
		this.gpa = gpa;
		}
	}
