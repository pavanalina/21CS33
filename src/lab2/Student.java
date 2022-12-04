package lab2;

import java.util.Scanner;

public class Student {
	String usn;
	String name;
	int credits[];
	float gradePoints[];
	int numberOfSubjects;
	Scanner input;
	
	public Student(String usn, String name,int numberOfSubjects)
	{
		this.usn = usn;
		this.name = name;
		this.numberOfSubjects=numberOfSubjects;
		credits=new int[numberOfSubjects];
		gradePoints=new float[numberOfSubjects];
		input=new Scanner(System.in);
	}
	public void readCredits()
	{
		//Scanner input=new Scanner(System.in);
		System.out.println("Enter the credit points");
		for(int i=0;i<numberOfSubjects;i++)
		{
			System.out.print("Enter the credits of subject"+(i+1));
			credits[i]=input.nextInt();
		}
		
	}
	public void readGradePoints() 
	{
		//Scanner input1=new Scanner(System.in);
		System.out.println("Enter the Grade points");
		for(int i=0;i<numberOfSubjects;i++)
		{
			System.out.print("Enter the Grade Points of subject"+(i+1));
			gradePoints[i]=input.nextFloat();
		}
		input.close();
	}
	public float calculateSGPA()
	{
		float sgpa=0,psws=0,totalCredits=0;
		for(int i=0;i<numberOfSubjects;i++)
		{
			psws+=credits[i]*gradePoints[i];
			totalCredits+=credits[i];
		}
		sgpa=psws/totalCredits;
		return sgpa;
	}
	public void display() {
		System.out.println("********************************");
		System.out.println("Student USN:"+usn);
		System.out.println("Student NAME:"+name);
		System.out.println("Subjects|credits|Points");
		for(int i=0;i<numberOfSubjects;i++)
		{
			System.out.println("subject"+(i+1)+"|   "+credits[i]+"  |  "+gradePoints[i]);
		}
		System.out.println("SGPA:"+calculateSGPA());
	}
}

