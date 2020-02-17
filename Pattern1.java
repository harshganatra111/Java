//for loop 

/*

2 0 0 0
0 4 0 0
0 0 6 0
0 0 0 8

*/

class Pattern1
{
  public static void main(String[] args)
  {
    int i,j;
    for(i=1;i<=4;i++)
     {
      for(j=1;j<=4;j++)
        {
	   if(i==j)
	    System.out.print(2*i); 
            else
             System.out.print("0");   
        }
	System.out.println(); 
     }
  }
}