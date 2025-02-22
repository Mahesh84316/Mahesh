package emailApp;

import java.util.Scanner;

public class Email {
private String FirstName;
private String LastName;
private String Password;
private String Department;
private String Email;
private int MailboxCapacity =500;
private int defaultPasswordLength =10;
private String AlternateEmail;
private String companySuffix ="mahecompany.com";


//Constructor to receive the first name and last name
public Email(String FirstName,String LastName) {
	this.FirstName=FirstName;
	this.LastName=LastName;
	
	
	//Call a method asking for the department -return the department
	this.Department=setDepartment();
	
	
	//Call a method that returns a random password
	this.Password = randomPassword(defaultPasswordLength);
	System.out.println("your password:" + this.Password);
	
	//Combine elements to generate email
	Email = FirstName.toLowerCase() + "." + LastName.toLowerCase() + "@" + Department + companySuffix;
	
}
//Ask for the department
private String setDepartment() {
	System.out.println("New Worker: "+FirstName+" "+LastName +". Department Codes:\n1 for Sales\n2 for Development\n3 for Account\n0 for none\nEnter"
			+ " Department Code: ");
	Scanner in=new Scanner(System.in);
	int depChoice=in.nextInt();
	if(depChoice==1)
	{
		return "sales";
	}
	else if(depChoice==2)
	{
		return "dev";
	}
	else if(depChoice==3)
	{
		return "acct";
	}
	else
	{
		return "";
	}
}

//Generate a random password
private String randomPassword(int length)
{
	String passwordSet="kjwefu@5127";
	char[] password=new char[length];
	for (int i=0; i<length; i++)
	{
	int rand=(int)	(Math.random() * passwordSet.length());
	password[i]=passwordSet.charAt(rand);
	}
	return new String(password);
}

//Set the mailbox capacity
public void setMailboxCapacity(int capacity)
{
	this.MailboxCapacity=capacity;
}

//Set the alternate email
public void setAlternateEmail(String altEmail)
{
	this.AlternateEmail = altEmail;
}

//Change the password
public void changePassword(String Password)
{
	this.Password = Password;
}
public int getMailboxCapacity()
{
	return MailboxCapacity;
}
public String getAlternateEmail()
{
	return AlternateEmail;
}
	public String getPassword()
	{
		return Password;	
}
	public String showInfo()
	{
		return "DISPLAY NAME: " +FirstName + " "+ LastName + "\nCOMPANY EMAIL: "+ Email +"\nMAILBOX CAPACITY: " +MailboxCapacity + "mb";
}
	public String getMail() {
		return Email;
	}
	public int getMailbox() {
		return MailboxCapacity;
	}
	
}



