package interfaces;
import classes.*;
import java.lang.*;

public interface StudentOperations
{
	void insertStudent(Student st);
	void removeStudent(Student st);
	Student getStudent(int studentId);
	void showAllStudent();
}