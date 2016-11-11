/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package objectwriteread;
import java.io.*;

/**
 * Student class.
 */ 
public class Student implements Serializable {
	private String stuName;
	private double stuGrade;
			
	/**
	 * constructor
	 * pre: none
	 * post: A Student object has been created. 
	 * Student data has been initialized with parameters.
	 */
	public Student(String name, double grade) {
		stuName = name;
		stuGrade = grade;
	}

	
	/**
	 * Creates a string representing the student object
	 * pre: none
	 * post: A string representing the student object has been returned.
	 */
	public String toString() {
		String stuString;
		
		stuString = stuName + " grade: " + stuGrade;
		return(stuString);
	}
}