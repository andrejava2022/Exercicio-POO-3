package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Approval {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.name = sc.nextLine();
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		
		student.finalGrade();
		student.result();
		System.out.println(student.result);
		
	}
	
	
}
