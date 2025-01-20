package classes;
import interfaces.*;
import java.lang.*;

public abstract class Id 
{
    protected int idNumber;
    protected double libraryFee;
    
    public void setIdNumber(int idNumber)
    {
     this.idNumber=idNumber;
    }
    public void setLibraryFee(double libraryFee)
    {
     this.libraryFee=libraryFee;
    }

    public int getIdNumber()
    {
      return idNumber;
    }
    public double getLibraryFee()
    {
      return libraryFee;
    }
    
    public abstract void showInfo();

    public void showDetails()
    {
      System.out.println("Id Number: "+idNumber);
      System.out.println("Library fee: "+libraryFee);
    }

}