// login mechanism 

import java.io.*;

class LogMech
{
   public static void main(String[] args) throws IOException
    {
        int username,password,otp;
        username=1234;
	password=1234;
	otp=9999;
        block1:
        while(true)
        {
	System.out.print("Enter Username : ");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int entered_username=Integer.parseInt(br.readLine());
	   if(username==entered_username)
             {
                block2:
                while(true)
                {
 	        System.out.print("Enter Password : ");
		int entered_password=Integer.parseInt(br.readLine());
		  if(password==entered_password)
                    {
                       block3:
                       while(true)
                       {
                       System.out.print("Enter OTP : ");
                       int entered_otp=Integer.parseInt(br.readLine());
                          if(otp==entered_otp)
                            {
                               System.out.println("You are logged in.");
                               break block1;
                            }
                           else
                            {
                               System.out.println("Wrong OTP.");
                               continue block3;
                            }
                        }
                    }
                   else
                     {
                        System.out.println("Wrong Password.");
                        continue block2;
                     }
                  }
             }
          else
           {
             System.out.println("Wrong Username");
             continue block1;
           }
        }
    }
}