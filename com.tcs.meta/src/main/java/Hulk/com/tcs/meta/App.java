package Hulk.com.tcs.meta;

import com.first.project1.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Employee e1 = new Employee("nit100");
    	Employee e2 = new Employee("nit100");
    	System.out.println(e1.equals(e2));
    	System.out.println(e1);
    	System.out.println(e1.hashCode());
    	System.out.println(e2.hashCode());
        System.out.println( "Hello World!" );
    }
}
