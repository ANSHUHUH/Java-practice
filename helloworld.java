package myfirstprogram;

import java.util.Scanner;
class print{
	public String username;
	public String pass;
	public void enterdetails(){
		Scanner c = new Scanner(System.in);
		System.out.println("enter your username : ");
		username = c.nextLine();
		System.out.println("enter the password : ");
		pass = c.nextLine();
	}
	public void verify(){
		if(username.equals("anshuhuh")) {
		    if(pass.equals("anshuvish")) {
		    	System.out.println("login sucessfully");
		    }
		    else {
		    	System.out.println("invalid password!!!");
		    }
	}else {
			System.out.println("invalid username!!!");
		}
	}
 }
public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      print o = new print();
      o.enterdetails();
      o.verify();
	}

}
