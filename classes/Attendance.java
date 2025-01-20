package classes;
import interfaces.*;
import java.lang.*;

public class Attendance extends Id 
{
	private int attendance;
	public void setAttendance(int attendance)
	{
		this.attendance = attendance;
	}
	public int getAttendance()
	{ 
		return attendance;
	}

	public void showInfo()
	{
		
	}
	public void showDetails()
	{
		System.out.println("Attendance: "+attendance);
		super.showDetails();
	}
}
