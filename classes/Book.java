package classes;
import interfaces.*;
import java.lang.*;

public class Book
{
	private long bookRf;
	private String bookName;

    public void setBookRf(long bookRf)
    { 
        this.bookRf=bookRf;
    }
    public void setBookName(String bookName)
    { 
        this.bookName=bookName;
    }

    public long getBookRf()
    { 
        return bookRf;
    }
    public String getBookName()
    { 
        return bookName;
    }

    public void showDetails()
    {
    	System.out.println("Book Name: "+bookName);
    	System.out.println("Book refferance: "+bookRf);
    }
}