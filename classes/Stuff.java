package classes;
import interfaces.*;
import java.lang.*;

public class Stuff 
{
	private int stuffId;
	private String stuffName;
	private double stuffSalary;
    private int stuffPhoneNumber;

    public void setStuffId(int stuffId)
    { 
        this.stuffId=stuffId;
    }
    public void setStuffName(String stuffName)
    { 
        this.stuffName=stuffName;
    }
    public void setStuffSalary(double stuffSalary)
    { 
        this.stuffSalary=stuffSalary;
    }
    public void setStuffPhoneNumber(int stuffPhoneNumber)
    { 
        this.stuffPhoneNumber=stuffPhoneNumber;
    }

    public int getStuffId()
    { 
        return stuffId;
    }
    public String getStuffName()
    {
        return stuffName;
    }
    public double getStuffSalary()
    { 
        return stuffSalary;
    }
    public int getStuffPhoneNumber()
    { 
        return stuffPhoneNumber;
    }

    public void showDetails()
    {
    	System.out.println("Stuff Name: "+stuffName);
    	System.out.println("Stuff Id: "+stuffId);
    	System.out.println("Stuff Phone Number: "+stuffPhoneNumber);
    	System.out.println("Stuff Salary: "+stuffSalary);
    }
    
}