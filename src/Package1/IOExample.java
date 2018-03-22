package Package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOExample {
	
	public static void main(String args[]) throws IOException {
		   
	      
	         int numbers [] = {11,21,3,40,5};
	         OutputStream os = new FileOutputStream("C:\\Users\\jyoth\\Downloads\\text.txt");
	         for(int x = 0; x < numbers.length ; x++)
	         {
	            os.write( numbers[x] );   
	         }
	         os.close();
	     
	         InputStream is = new FileInputStream("C:\\Users\\jyoth\\Downloads\\text.txt");
	         int size = is.available();

	         for(int i = 0; i < size; i++) 
	         {
	            System.out.print((int)is.read() + "  ");
	         }
	         is.close();
	      } 
	  	
	   }


