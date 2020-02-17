//user input using InputStreamReader and BufferedReader classes

import java.io.*;

class IOReadLine1
{
  public static void main(String[] args) throws IOException
  {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

     System.out.print("Enter your first name : ");
     String fname=br.readLine();
     System.out.print("Enter your last name : ");
     String lname=br.readLine();

     System.out.println("Your Fullname is : "+fname+" "+lname);
  }
}