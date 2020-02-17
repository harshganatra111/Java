//display ASCII table

class AsciiTable
{
   public static void main(String[] args)
    {
      System.out.println("Displaying characters (A-Z) with their ASCII Values : ");
      System.out.println("ASCII value\t character");
	for(int i=65;i<=90;i++)
	{
 	   System.out.println(i+"\t\t"+(char)i);
	}
	System.out.println("Displaying ASCII Value with their character(a-z)");
	for(int j=97;j<=122;j++)
	  { 
 	     System.out.println(j+"\t\t"+(char)j);
	  }
	System.out.println("Displaying ASCII Value with their character(0-9)");
	for(int k=48;k<=57;k++)
	  {
  	    System.out.println(k+"\t\t"+(char)k);
	  }
    }
}
