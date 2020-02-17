// multiplication of array
import java.io.*;
class Multi
{
   public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of rows for Array 1 :");
        int r1=Integer.parseInt(br.readLine());

        System.out.print("\nEnter number of columns for Array 1 : ");
        int c1=Integer.parseInt(br.readLine());

        System.out.println("Enter Elements for Array 1");
        int arr1[][]=new int[r1][c1];
        for(int i=0;i<r1;++i)
	 {
 	   for(int j=0;j<c1;++j)
            {
             arr1[i][j]=Integer.parseInt(br.readLine());  
            }
	 }

        System.out.print("Enter number of rows for Array 2 :");
        int r2=Integer.parseInt(br.readLine());

        System.out.print("\nEnter number of columns for Array 2 : ");
        int c2=Integer.parseInt(br.readLine());

	System.out.println("Enter Elements for Array 2");
        int arr2[][]=new int[r2][c2];

        for(int i=0;i<r2;++i)
	 {
 	   for(int j=0;j<c2;++j)
            {
             arr2[i][j]=Integer.parseInt(br.readLine());  
            }
	 }

         System.out.println("Multiplication of Array 1 and Array 2 is : ");						
           for(int i=0;i<r1;++i)											
            {														
              for(int j=0;j<c2;++j)
              {	 
                int a=0;												 
                for(int k=0;k<r2;++k)
                {
		  for(int l=0;l<c1;++l)
                  {
                     a+=arr1[i][l]*arr2[k][j];
                  }
                }
                System.out.print(a+"\t");
              }
              System.out.println();
            }
    }
}