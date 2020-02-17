//convert Character to ASCII and vice versa using switch case

import java.io.*;

class ConvertValue
{
  public static void main(String[] args) throws IOException
   {
     System.out.println("1. Character to ASCII");
     System.out.println("2. ASCII to character");
     System.out.print("Enter your choice(1/2) : ");
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int a=Integer.parseInt(br.readLine());     
     switch (a)
         {
	 case 1:
           System.out.print("Enter a character : ");
	   char ch=(char)br.read();
	   System.out.println("Character\tASCII Value");
	   System.out.println(ch+"\t\t"+(int)ch);
	   break;
         case 2:
           System.out.print("Enter ASCII Value : ");
	   int val=Integer.parseInt(br.readLine());
   	   System.out.println("ASCII Value\tCharacter");
	   System.out.println(val+"\t\t"+(char)val);
	   break;
	default :
	  System.out.println("Invalid Input");
	  break;
	}
   }
}
