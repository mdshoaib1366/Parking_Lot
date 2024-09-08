package serialization_Pros;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial_Employee {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		var fin = new FileInputStream("c:\\new\\Employee.txt");
		var ois = new ObjectInputStream(fin);
		
		try(ois;fin)
		{
			Employee emp;
			while((emp = (Employee)ois.readObject()) != null)
			{
				System.out.println(emp);
			}
		}
		catch(EOFException e)
		{
//			e.printStackTrace();
			System.err.println("End of File...");
		}
	}

}
