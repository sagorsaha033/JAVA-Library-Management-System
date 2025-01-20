package classes;
import java.lang.*;
import interfaces.*;

public class Student implements IdOperations
{
	private String studentName;
	private int phoneNumber;
	private int studentId;
	private Id id[] = new Id[20];

	public void setStudentName(String studentName)
	{ 
		this.studentName=studentName;
	}
	public void setPhoneNumber(int phoneNumber)
	{ 
		this.phoneNumber=phoneNumber;
	}
	public void setStudentId(int studentId)
	{ 
		this.studentId=studentId;
	}

	public String getStudentName()
	{ 
		return studentName;
	}
	public int getPhoneNumber()
	{ 
		return phoneNumber;
	}
	public int getStudentId()
	{ 
		return studentId;
	}

	public void insertId(Id a)
	{
		int flag = 0;
		for(int i =0; i<id.length; i++)
		{
			if(id[i] == null)
			{
				id[i]=a;
				flag=1;
				break;
			}

		}
		if(flag == 1)
			{ 
				System.out.println("Id Inserted");
			}
		else
		    { 
			    System.out.println("Can Not Insert Id");
			}
	}

	public void removeId(Id a)
	{
        int flag = 0;
		for(int i = 0; i<id.length; i++)
		{
			if(id[i] == a)
			{
                id[i] = null;
                flag = 1;
                break;
			}
		}
		if(flag == 1)
			{ 
				System.out.println("Student Removed");
			}
		else
			{ 
				System.out.println("Can Not Remove Student");
			}
	}

	public Id getId(int idNumber)
	{
		Id a = null;
		for(int i = 0; i<id.length; i++)
		{
			if(id[i] != null)
			{
				if(id[i].getIdNumber() == idNumber)
				{
					a = id[i];
					break;
				}
			}
		}
		if(a != null)
		{
			System.out.println("Id Found");
		}
		else
		{
			System.out.println("Id Not Found");
		}
		return a;
	}
	
	public void showAllId()
	{
		for(int i=0; i<id.length; i++)
		{
			if(id[i] != null)
			{
				id[i].showDetails();
				System.out.println();
			}
		}
	}

	public void showDetails()
	{
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Phone Number: "+phoneNumber);
		System.out.println("Student Id: "+studentId);
	}
}