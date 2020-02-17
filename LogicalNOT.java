//logical NOT operator

class LogicalNOT
{
  public static void main(String[] args)
  {
    int a=200,b=20;

    if(!(a>b))
	System.out.println("a is not greater than b.");

    boolean b1=true;

    if(b1)  //if(b1==true)
	System.out.println("Yes");
    if(!b1) //if(b1==false)
	System.out.println("No");
  }
}