package com.lab.work;

public class Employeee {

	//declare instance variables
        private String firstName;
        private String lastName;
        private int employeeId;
        private double salary;
        private int noOfProject;
	
	//implement setEmployeeData method which takes instance type variables as parameters 
	//later initialise instance variables
	//return type is void
	public void setEmployeeData(String firstName,String lastName, int employeeId,int noOfProject,double salary)
	{
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.employeeId = employeeId;
	    this.noOfProject = noOfProject;
	    this.salary = salary;
	}


	
	//implement calculate method no parameters and no return type
	//increment salary based on condition
    public void calculateSalary()
    {
        if(noOfProject>5 && noOfProject<=10) salary = salary+5000;
        else if(noOfProject>10 && noOfProject<=20) salary = salary+10000;
        else if(noOfProject>20)salary = salary + 15000;
    }
	//override toString method
	public String showDetails()
	{
	    String str = "";
	    
	    str+="Employee First-Name:"+firstName+"\nEmployee Last-Name:"+lastName+"\nEmployee Id:"+employeeId+"\nNumber Of Project: "+noOfProject+"\nSalary: "+salary;
	    
	    return str;
	}
	
}