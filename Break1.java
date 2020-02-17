//break statement inside blocks

class Break1
{
  public static void main(String[] args)
  {
     int a=0;
     block1:
	{
	   System.out.println("Inside Block1");
	   if(a==0)
		break block1;  
	   block2:
		{
		   System.out.println("Inside Block2");  
		   if(a%2==0)
			break block2;
		   block3:
			{
			   System.out.println("Inside Block3");  
			   if(a%2!=0)
				break block3;
			   System.out.println("End of Block3");  
			}
		   System.out.println("End of Block2");  
		}
	   System.out.println("End of Block1");
	}
  }
}