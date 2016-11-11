/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package objectwriteread;
import java.io.*;
  
 /**
  * A program that writes and reads objects to and from a file.
  */
 public class ObjectWriteRead {

	public static void main(String[] args) {
		File stuFile = new File("students.dat");
		
		try {
			/* write objects */
			FileOutputStream out = new FileOutputStream(stuFile);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			writeStu.writeObject(new Student("Drew", 87));
			writeStu.writeObject(new Student("Tia", 92));
			writeStu.close();
    		System.out.println("Data written to file.");
    		
    		/* read objects */
			FileInputStream in = new FileInputStream(stuFile);
			ObjectInputStream readStu = new ObjectInputStream(in);
			Student stu1 = (Student)readStu.readObject();
			Student stu2 = (Student)readStu.readObject();
			readStu.close();
			
			System.out.println(stu1);
			System.out.println (stu2);
			
    	} catch (FileNotFoundException e) {
			System.out.println("File could not be found.");
    		System.err.println("FileNotFoundException: " + e.getMessage());
    	} catch (IOException e) {
			System.out.println("Problem with input/output.");
    		System.err.println("IOException: " + e.getMessage());
    	} catch (ClassNotFoundException e) {
			System.out.println("Class could not be used to cast object.");
    		System.err.println("ClassNotFoundException: " + e.getMessage());
    	}
	}	
 }
