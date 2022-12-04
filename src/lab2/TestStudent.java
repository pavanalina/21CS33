package lab2;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String usn,name;
		int numberOfSubjects;
		System.out.println("Welcome to SGPA calculation Application");
		System.out.print("Enter your name:");
		name=input.nextLine();
		System.out.print("Enter your USN:");
		usn=input.nextLine();
		System.out.print("Enter the number of Subejcts:");
		numberOfSubjects=input.nextInt();
		
		Student s=new Student(usn, name, numberOfSubjects);
		s.readCredits();
		s.readGradePoints();
		s.display();
		input.close();
	}

}
