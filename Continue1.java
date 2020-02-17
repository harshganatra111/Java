//continue statement inside blocks

class Continue1
{
  public static void main(String[] args)
  {
     int a=0;
     block1:
     while(true)
	{
	    a++;
	    System.out.println("Inside Block1");
	    if(a%2!=0)
		continue block1;
	    System.out.println("End of Block1");
		break block1;
	}
  }
}