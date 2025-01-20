package interfaces;
import classes.*;
import java.lang.*;

public interface IdOperations
{
	void insertId(Id a);
	void removeId(Id a);
	void showAllId();
	Id getId(int idNumber);
}