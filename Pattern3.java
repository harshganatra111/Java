// for and while loop

/*

* * * *
 * * *
  * *
   *

*/

class Pattern3
{
   public static void main(String[] args)
     {
	System.out.println("For Loop");

        for(int i=4,s=0;i>=1;--i,++s)
	   {
	        //for printing space
                for(int k=0;k<=s;++k)
                {
                   System.out.print(" ");
                }

	        //for printing stars
		for(int j=1;j<=i;++j)
		{   
		   System.out.print("* ");  	
		}
		System.out.println();
	   }

         System.out.println("While Loop");
         
         int i=4,s=0;
	 while(i>=1)
         {
 	    int k=0;
 	    while(k<=s)
            {
	       System.out.print(" ");
	       ++k;
	    }

	    int j=1;
	    while(j<=i)
	    {
	       System.out.print("* ");
	       ++j;
	    }
	    System.out.println();
	    --i;
	    ++s;
         }
     }
}