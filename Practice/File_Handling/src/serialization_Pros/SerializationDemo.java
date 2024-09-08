package serialization_Pros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		var fout = new FileOutputStream("c:\\new\\Employee.txt");
		var oos = new ObjectOutputStream(fout);
		Scanner sc = new Scanner(System.in);
		
		try(fout;oos;sc)
		{
			System.out.print("How many object you want to write: ");
			int noOfObjects = sc.nextInt();
			
			for (int i = 1; i <= noOfObjects; i++) {
				Employee emp = Employee.getEmployeeObject();
				oos.writeObject(emp);
			}
			System.out.println("Complete");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
