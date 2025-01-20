package classes;
import interfaces.*;
import java.lang.*;

public class Fee extends Id 
{
	private int fee;
	public void setFee(int fee)
	{
		this.fee = fee;
	}
	public int getFee()
	{ 
		return fee;
	}

	public void showInfo()
	{
		
	}
	public void showDetails()
	{
		System.out.println("Fee: "+fee);
		super.showDetails();
	}
}
