package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationExample {
	 
	public static void main(String [] args) throws ClassNotFoundException 
	{
	      Employee e = null;
	      try 
	      {
	         FileInputStream fileIn = new FileInputStream("C:\\Users\\jyoth\\Downloads\\employee.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         
	         e = (Employee) in.readObject();
	         System.out.println(e.display());
	         
	         in.close();
	         fileIn.close();
	      } catch (IOException Exception) 
	      {
	         System.out.println("IO Exception is : "+Exception);
	      } 
	      
	      
	   }

}
