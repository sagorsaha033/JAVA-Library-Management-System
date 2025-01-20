package interfaces;
import classes.*;
import java.lang.*;

public interface BookOperations
{
	void insertBook(Book b);
	void removeBook(Book b);
	Book getBook(long BookRf);
	void showAllBook();
}