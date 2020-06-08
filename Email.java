package emailapp;

import java.util.Scanner;

public class Email
{
   private String firstName;
   private String lastName;
   private String department;
   private String password;
   int mailboxCapacity=500;
   String alternateEmail;
   private String email;
   private String companySuffix= "lanalabs.com";
   private int defaultpasswordLength = 10;
   //constructor
   public Email(String firstName,String lastName) 
   {
	   this.firstName = firstName;
	   this.lastName =lastName;
	 //  System.out.println(this.firstName + " " + this.lastName);
	   this.department = setDepartment();
	  // System.out.println("Department is" + " " + this.department);
	   this.password =randomPassword(defaultpasswordLength);
	 //  System.out.println("Your Password is" + " " + this.password);
	   email = firstName.toLowerCase()+"." + lastName.toLowerCase() +"@"+ department +"." + companySuffix;
	//   System.out.println(email);
   }
   
   private String setDepartment()
   {
	   
	System.out.println( " New worker" + firstName + " Enter the department\n 1.FrontEndDevelopment\n 2.BackendDevelopment\n 3.DataScientist\n 4.none");
	   Scanner scanner = new Scanner(System.in);
	 int choice =  scanner.nextInt();
	 switch(choice)
	 {
	 case 1 : return   "frontenddevelopment";
	         
	 case 2: return "BackendDevelopment";
	 case 3: return "DataScientist";
	 default: return "none";
	 
	 }
   } 
	 private String randomPassword(int length)
	 {
		  String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#@$%^&*!";
		  //we are creating password array and setting its length as length of password
		  char [] password = new char[length];
		  for(int i=0;i<length;i++)
		  {
			int rand =   (int)( Math.random()*passwordSet.length());
			//math.random function will give an integer between zero and one
			password[i] = passwordSet.charAt(rand);
		  }
		  return new String(password);
	 }
	 public void setMailboxCapacity(int capacity){
		 this.mailboxCapacity = capacity;
		 
		 
	 }
	 public void setAlternateEmail(String altEmail)
	 {
		  this.alternateEmail=altEmail;
	 }
	 public int getmailboxCapacity(){
		return this.mailboxCapacity ;
	 }
	 public String getAlternateEmail()
	 {
		 return alternateEmail;
	 }
	 public String getPassword()
	 {
		 return password;
	 }
	 public String showInfo()
	 {
		 return "\nDisplay Name:" + firstName + " " +lastName + "\nCompany Email" + email + "\nMailbox capacity" + mailboxCapacity + "mb";
	 }
   }



	

