package student;
import java.util.*;
public class Student {
	String USN;
	String name;
	String branch;
	long phone;
	void getDetails()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter student USN");
		USN=in.nextLine();
		System.out.println("enter student name");
		name=in.nextLine();
		System.out.println("enter branch");
		branch=in.nextLine();
		System.out.println("enter phone no.");
		phone=in.nextLong();
	}
	void putDetails()
	{
		System.out.println("\n\tUSn:"+USN+"\n\tName:"+name+"\n\tBranch:"+branch+"\n\tphone:"+phone);
		System.out.println("\n");
	}
	public static void main (String args[])
	{
		int i,n;
		System.out.println("enter the number of students");
		Scanner in=new Scanner(System.in);
				n=in.nextInt();
		Student a[]=new Student[n];
		for(i=0;i<n;i++)
			a[i]=new Student();
		for(i=0;i<n;i++)
		{
			System.out.println("enter details of student\n");
			a[i].getDetails();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("\nthe details of student"+(i+1));
			a[i].putDetails();
		}
	}
}

