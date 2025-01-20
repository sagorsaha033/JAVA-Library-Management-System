import interfaces.*;
import classes.*;
import java.lang.*;
import java.util.*;
import fileio.*;

public class Start 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
        
		String user, pass, choice;

		System.out.println("Press 1 for User login \n    2 for Admin login");
		choice = sc.nextLine();

		System.out.println("Username: ");
		user = sc.nextLine();

		System.out.println("Password: ");
		pass = sc.nextLine();

		switch(choice){
			case "1":
				if(user.equals("Sagor") && pass.equals("1234"))
				{
					System.out.println("Successfully Login");
				}
				else
				{
					System.out.println("Invalid Username or Password!");
				}
				break;
			case "2":
			 	if(user.equals("Admin") && pass.equals("5678"))
				{
					System.out.println("Successfully Login");
				}
				else
				{
					System.out.println("Invalid Username or Password!");
				}

	}
		System.out.println();
		System.out.println("Welcome to Library Management System ");
		Library l = new Library();

		boolean choice1 = true;

		while(choice1)
		{
			System.out.print("Follow The Below Option: \n");
			System.out.println("  1. Student Management");
			System.out.println("  2. Book Management");
			System.out.println("  3. Stuff Management");
			System.out.println("  4. Member Attendance and Fee");
			System.out.println("  5. Quit Application\n");
			System.out.print("Select Any Option: ");

			int first = sc.nextInt();
			System.out.println();

			switch(first)
			        {
			      	    case 1:
			      	        System.out.println("Welcome to Student Management");
			      	        System.out.print("Follow The Below Option:\n");
			      	        System.out.println("  1. Create a New Student");
			      	        System.out.println("  2. Remove Existing Student");
			      	        System.out.println("  3. See all Students");
			      	        System.out.println("  4. Go Back\n");
			      	        System.out.print("Select Any Option: ");

			      	        int second1 = sc.nextInt();
			      	        System.out.println();

			      	        switch(second1)
			      	        {
			      	        	case 1:
			      	        	    System.out.println("Selected to create a New Student\n");
			      	        	    System.out.println("Student Name: ");
			      	        	    String name = sc.next();
			      	        	    System.out.println("Student Phone Number: ");
			      	        	    int num = sc.nextInt();
			      	        	    System.out.println("Student Id:");
			      	        	    int id = sc.nextInt();

    	                            Student student = new Student();
    	                            student.setStudentName(name);
    	                            student.setPhoneNumber(num);
    	                            student.setStudentId(id);
    	                            l.insertStudent(student);
    	                            break;

    	                        case 2:
    	                                    
    	                            System.out.println("Selected to Remove an Existing Student");
    	                            System.out.println("Student ID: ");
    	                            l.removeStudent(l.getStudent(sc.nextInt()));
    	                            break;
    	                                    
    	                        case 3:
    	                                    
    	                            System.out.println("Selected to See all Students\n");
    	                            l.showAllStudent();
    	                            break;

    	                        case 4:
    	                                    
    	                            System.out.println("Selected to Go Back");
    	                            break;
    	                                    
    	                        default:
    	                            System.out.println("Invalid!");
    	                            break;

			      	        }
			      	        break;

			      	    case 2:
			      	        System.out.println("Welcome to Book Management");
			      	        System.out.print("Follow The Below Option:\n");
			      	        System.out.println("  1. Create a New Book");
			      	        System.out.println("  2. Remove Existing Book");
			      	        System.out.println("  3. See all Book");
			      	        System.out.println("  4. Go Back\n");
			      	        System.out.print("Select Any Option: ");

			      	        int second2 = sc.nextInt();
			      	        System.out.println();

			      	        switch(second2)
			      	        {
			      	            case 1:
			      	                System.out.println("Selected to Create a New Book\n");
			      	               	System.out.println("Book Name: ");
			      	                String name1 = sc.next();
			      	       	        System.out.println("Book Refferance: ");
			      	       	        long rf1 = sc.nextLong();
			      	       	        
			      	                Book b = new Book();
			      	       	        b.setBookName(name1);
			      	       	        b.setBookRf(rf1);
			      	       	        l.insertBook(b);
			      	       	        break;

			      	       	    case 2:
			      	       	        System.out.println("Selected to Remove an Existing Book ");
			              	        System.out.println("Book Refferance: ");
			   	        	        l.removeBook(l.getBook(sc.nextLong()));
			   	        	        break;

			      	            case 3:
			      	       	        System.out.println("Selected to See all Existing Book ");
			      	       	        l.showAllBook();
			      	       	        break;
			      	       	    case 4:
			      	       	        System.out.println("Selected to Go Back ");
			      	       	        break;
			      	       	    default:
			      	       	        System.out.println("Invalid!");
			                }
			   	            break;

			            case 3:
	  	                    System.out.println("Welcome to Stuff Management");
		                    System.out.print("Follow The Below Option:\n");
			      	        System.out.println("  1. Create a New Stuff");
			                System.out.println("  2. Remove Existing Stuff");
			                System.out.println("  3. See all Stuffs");
			      	        System.out.println("  4. Go Back\n");
			      	        System.out.print("Select Any Option: ");

			      	        int second3 = sc.nextInt();
			                System.out.println();

			      	        switch(second3)
			                {
			      	            case 1: 
			      	      	        System.out.println("Selected to Create a New Stuff\n");
		            	            System.out.println("Stuff Name: ");
			      	        	    String name2 = sc.next();
			      	                System.out.println("Stuff Phone Number: ");
			      	        	    int num2 = sc.nextInt();
			      	                System.out.println("Stuff Id");
			      	                int id2 = sc.nextInt();
			      	                System.out.println("Stuff Salary");
			      	                double salary2 = sc.nextDouble();

			      	        	    Stuff stuff = new Stuff();
			      	        	    stuff.setStuffName(name2);
			      	        	    stuff.setStuffPhoneNumber(num2);
			      	        	    stuff.setStuffId(id2);
			      	        	    stuff.setStuffSalary(salary2);
			      	        	    l.insertStuff(stuff);
			      	        	    break;

			      	            case 2:
			      	        	    System.out.println("Selected to Remoive an Existing Stuff");
			      	        	    System.out.println("Stuff Id: ");

			      	        	    l.removeStuff(l.getStuff(sc.nextInt()));
			      	        	    break;

			      	            case 3:
			      	        	    System.out.println("Selected to See all the Stuffs");
			      	        	    l.showAllStuff();
			      	        	    break;

			      	        	case 4:
			      	        	    System.out.println("Selected to Go Back");
			      	        	    break;

			      	        	default:
			      	        	    System.out.println("Invalid! ");
			      	        	    break;   
			      	        }
                            break;

			            case 4:
			      	        System.out.println();
			      	        System.out.println("Follow The Below Option:");
			      	        System.out.println("1. See Student Attendance and Library Fee: ");
			      	        System.out.println("2. Go Back");
			      	        System.out.print("Select Any Option: ");			      	                   
			      	                    
			      	        int second4 = sc.nextInt();
			      	                     
			      	        switch(second4)
			      	        {
			      	            case 1:
			      	                System.out.println("Id Number: ");
			      	                int idNum = sc.nextInt();
			      	                System.out.println("Library Fee: ");
			      	                double fee = sc.nextDouble();
			      	                System.out.println("Attendance of this Month: ");  
			      	                int atd = sc.nextInt();
			      	                System.out.println();

			      	                Attendance attendance = new Attendance();
			      	                    	
			      	                attendance.setIdNumber(idNum);
			      	                attendance.setLibraryFee(fee);
			      	                attendance.setAttendance(atd);

			      	                attendance.showDetails();
			      	                break;

			      	           	case 2:
			      	                System.out.println("Selected to Go Back");
			      	                break;

			      	            default:
			      	                System.out.println("Invalid!"); 
			      	                break;

			      	        } 
			                break;      

			            case 5:
			      	        System.out.println("Quit the Application");
					        System.out.println("Thank You For Using Our Sample Library Management System ");				                       
					        choice1 = false;
					        break;
					
				        default:
			                System.out.println("Invalid!");
			                break;
                    }
		}

	}
}