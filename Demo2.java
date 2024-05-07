
import java.util.Scanner;
c lass Dev
{
	int id,age;
	int salary=60000;
	String name;
	String desig="Developer";
	Dev()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter ID : ");
		 id=sc.nextInt();
		System.out.println(" Enter Name : ");
		 name=sc.next();
		System.out.println(" Enter Age : ");
		 age=sc.nextInt();
				

	}	
	void display()
	{
		System.out.println(" Hi ID "+id);	
		System.out.println(" My Name : "+name);	
		System.out.println(" Hi AGE "+age);	
		System.out.println(" My Salary : "+salary);		
		System.out.println(" My Designation : "+desig);	
	}
}
class Clerk
{
	int id,age;
	int salary=20000;
	String name;
	String desig="Clerk";
	Clerk()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter ID : ");
		 id=sc.nextInt();
		System.out.println(" Enter Name : ");
		 name=sc.next();
		System.out.println(" Enter Age : ");
		 age=sc.nextInt();
	}	
	void display()
	{
		System.out.println(" Hi ID "+id);	
		System.out.println(" My Name : "+name);	
		System.out.println(" Hi AGE "+age);	
		System.out.println(" My Salary : "+salary);		
		System.out.println(" My Designation : "+desig);	
	}
}

public class Demo2
{
	public static void main(String args[])
	{
		int ch1=0;
		do{
			System.out.println("1) Developer");
			System.out.println("2) Clerk");
			System.out.println("3) Exit");

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the choice :");
			 ch1= sc.nextInt();
		
			if(ch1==1)
			{
				Dev d = new Dev();
				d.display();
			}
			if(ch1==2)
			{
				Clerk c = new Clerk();
				c.display();
			}
			if(ch1==3)
			{
				System.out.println("Thank You");
				System.exit(0);
			}

		}while(ch1!=3);	
	}
}