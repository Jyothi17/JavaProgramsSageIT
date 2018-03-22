package Serialization;

import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationExample {
	
	public static void main(String [] args) {
	 /*     Employee e1 = new Employee("Java","Frisco",5480,33) ;
	      Employee e2 = new Employee("Nova","Frisco",5480,33);
	      Employee e3 = new Employee("John","Frisco",5480,33);
	      Employee e4 = new Employee("Brain","Frisco",5480,33);
	      Employee e5 = new Employee("Jack","Frisco",5480,33);
	      Employee e6 = new Employee("Jill","Frisco",5480,33);
	      Employee e7 = new Employee("Tom","Frisco",5480,33);
	      Employee e8 = new Employee("Smith","Frisco",5480,33);*/
	      
	      List<Employee> list = new ArrayList<Employee>();
	      
	      list.add(new Employee("Java","Frisco",5480,33));
	      list.add(new Employee("Nova","Frisco",5481,34));
	      list.add(new Employee("John","Frisco",5483,35));
	      list.add(new Employee("Brain","Frisco",5450,43));
	      list.add(new Employee("Jack","Frisco",5485,35));
	      list.add(new Employee("Jill","Frisco",5481,31));
	      list.add(new Employee("Tom","Frisco",5900,32));
	      list.add(new Employee("Smith","Frisco",5639,23));
	      list.add(new Employee("Joseph","Frisco",5257,93));
	      
	      
	      
	      try {
	         FileOutputStream fOut = new FileOutputStream("C:\\Users\\jyoth\\Downloads\\employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fOut);
	         for(Employee emp : list)
	         {
	             out.writeObject(emp);
	             System.out.println(emp.getName());
	         }
	         out.close();
	         fOut.close();
	         
	        } catch (IOException Exception) {
	         System.out.println("Exception is : "+Exception);
	      }
	   }
}
