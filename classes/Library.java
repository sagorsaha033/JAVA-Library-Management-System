package classes;
import interfaces.*;
import java.lang.*;

public class Library implements StudentOperations, StuffOperations, BookOperations
{
    private Student students[] = new Student[500];
    private Stuff stuffs[] = new Stuff[40];
    private Book books[] = new Book[2000];

    public void insertStudent(Student st)
    {
    	int flag = 0;
    	for(int i = 0; i<students.length; i++)
    	{
    		if(students[i] == null)
    		{
    			students[i] = st;
    			flag = 1;
    			break;
    		}
    	}
    	if(flag == 1)
    		{
    			System.out.println("Student Inserted");
    		}
    	else 
    		{
    			System.out.println("Student Can Not Insert");
    		}
    }

    public void removeStudent(Student st)
    {
        int flag = 0;
    	for(int i = 0; i<students.length; i++)
    	{
    		if(students[i] == st)
    		{
    			students[i] = null;
    			flag = 1;
    			break;
    		}
    	}
    	if(flag == 1)
    		{
    			System.out.println("Student Removed ");
    		}
    	else 
    		{
    			System.out.println("Student Can Not Remove");
    		}
    }

    public Student getStudent(int studentId)
	{
		Student st = null;
		for(int i = 0; i<students.length; i++)
		{
			if(students[i] != null)
			{
				if(students[i].getStudentId() == studentId)
				{
					st = students[i];
					break;
				}
			}
		}
		if(st != null)
		{
			System.out.println("Student Found");
		}
		else
		{
			System.out.println("Student Not Found");
		}
	     return st;
	}
	
	public void showAllStudent()
	{
		for(int i = 0; i<students.length; i++)
		{
			if(students[i] != null)
			{
				students[i].showDetails();
				System.out.println();
			}
		}
	}

	public void insertBook(Book b)
    {
    	int flag = 0;
    	for(int i = 0; i<books.length; i++)
    	{
    		if(books[i] == null)
    		{
    			books[i] = b;
    			flag = 1;
    			break;
    		}
    	}
    	if(flag == 1)
    		{
    			System.out.println("Book Inserted");
    		}
    	else 
    		{
    			System.out.println("Book Can Not Insert");
    		}
    }

    public void removeBook(Book b)
    {
        int flag = 0;
    	for(int i = 0; i<books.length; i++)
    	{
    		if(books[i] == b)
    		{
    			books[i] = null;
    			flag = 1;
    			break;
    		}
    	}
    	if(flag == 1)
    		{
    			System.out.println("Book Removed ");
    		}
    	else 
    		{
    			System.out.println("Book Can Not Remove");
    		}
    }

    public Book getBook(long bookRf)
	{
		Book b = null;
		for(int i = 0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				if(books[i].getBookRf() == bookRf)
				{
					b = books[i];
					break;
				}
			}
		}
		if(b != null)
		{
			System.out.println("Book Found");
		}
		else
		{
			System.out.println("Book Not Found");
		}
	     return b;
	}
	
	public void showAllBook()
	{
		for(int i = 0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				books[i].showDetails();
				System.out.println();
			}
		}
	}

	public void insertStuff(Stuff s)
    {
    	int flag = 0;
    	for(int i = 0; i<stuffs.length; i++)
    	{
    		if(stuffs[i] == null)
    		{
    			stuffs[i] = s;
    			flag = 1;
    			break;
    		}
    	}
    	if(flag == 1)
    		{
    			System.out.println("Stuff Inserted");
    		}
    	else 
    		{
    			System.out.println("Stuff Can Not Inserted");
    		}
    }

    public void removeStuff(Stuff s)
    {
        int flag = 0;
    	for(int i = 0; i<stuffs.length; i++)
    	{
    		if(stuffs[i] == s)
    		{
    			stuffs[i] = null;
    			flag = 1;
    			break;
    		}
    	}
    	if(flag == 1)
    		{
    			System.out.println("Stuff Removed ");
    		}
    	else 
    		{
    			System.out.println("Stuff Can Not Remove");
    		}
    }

    public Stuff getStuff(int stuffId)
	{
		Stuff s = null;
		for(int i = 0; i<stuffs.length; i++)
		{
			if(stuffs[i] != null)
			{
				if(stuffs[i].getStuffId() == stuffId)
				{
					s = stuffs[i];
					break;
				}
			}
		}
		if(s != null)
		{
			System.out.println("Stuff Found");
		}
		else
		{
			System.out.println("Stuff Not Found");
		}
	     return s;
	}
	
	public void showAllStuff()
	{
		for(int i = 0; i<stuffs.length; i++)
		{
			if(stuffs[i] != null)
			{
				stuffs[i].showDetails();
				System.out.println();
			}
		}
	} 
 
}