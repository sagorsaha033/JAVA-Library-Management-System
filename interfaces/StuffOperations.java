package interfaces;
import classes.*;
import java.lang.*;

public interface StuffOperations
{
	void insertStuff(Stuff s);
	void removeStuff(Stuff s);
	Stuff getStuff(int stuffId);
	void showAllStuff();
}