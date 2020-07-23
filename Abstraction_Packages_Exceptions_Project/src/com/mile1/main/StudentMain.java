package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	static Student data[] = new Student[10];
	
	static {
		for (int i = 0; i < data.length; i++) 
			data [i]= new Student(); 
		
		data [0] = new Student("A1", new int[] {72, 73, 74});
		data [1] = new Student("B1", new int[] {75, 76, 77});
		data [2] = new Student("C1", new int[] {99,99,99});
		data [3] = new Student("C3", new int[] {100,100,99});
		data [4] = new Student("B2", new int[] {13, 88, 13}); 
		data [5] = new Student("C3", new int[] {14, 14, 99}); 
		data [6] = new Student("A2", new int[] {77,55,12}); 
		data [7] = new Student(null, new int[] {13, 88, 13});
		data [8] = new Student("A2", null);
		data [9] = null; 
		
	}
	
	public static void main(String[] args) {
		StudentReport studentReport = new StudentReport();
		StudentService studentService = new StudentService();
		
		System.out.println("Grade Calculation:");
		
		String x = null;
		
		for (int i = 0; i < data.length; i++)  {
			try {
				x = studentReport.validate(data[i]);
			} catch (NullNameException e) {
				x = "NullNameException occured";
			} catch (NullMarksArrayException e) {
				x = "NullMarksArrayException occured";
			} catch (NullStudentException e) {
				x = "NullStudentException occured";
			}
			
			System.out.println("GRADE = " + x);
		}
		
		System.out.println("Number of Objects with Marks array as null = " +
								studentService.findNumberOfNullMarks(data));
		System.out.println("Number of Objects with Name as null = " +
								studentService.findNumberOfNullNames(data));
		System.out.println("Number of Objects that are entierly null = " +
								studentService.findNumberOfNullObjects(data));
		
		
		System.out.println("TC7: Number of Objects with Name as null = " +
				studentService.findNumberOfNullNames(data));		
		
		System.out.println("TC8: Number of Objects that are entierly null = " +
				studentService.findNumberOfNullObjects(data));
		
		System.out.println("TC9: Number of Objects with Marks array as null = " +
				studentService.findNumberOfNullMarks(data));
	}

}