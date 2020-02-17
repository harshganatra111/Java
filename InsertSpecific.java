// insert elemewnt to specific position 

import java.io.*;

class InsertSpecific
{
   public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.print("Enter number of elements :");
	int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
	System.out.println("Enter elements to the array : ");
        for(int i=0;i<n;i++)
	 {
 	   arr[i]=Integer.parseInt(br.readLine());
	 }
        System.out.print("Enter position to insert element to the array : ");
        int pos=Integer.parseInt(br.readLine());
        pos=pos-1;
	if(pos>=n)
         {
           System.out.println("Position should not exceed "+n); 
         }
        else
         {	   
          int temp[]=new int[n+1];
          for(int i=n;i>pos;i--)
          {
            temp[i]=arr[i-1];
          }
          
          System.out.print("Enter the value to insert : ");
          int val=Integer.parseInt(br.readLine());
	  temp[pos]=val;

	  for(int i=pos-1;i>=0;--i)
           {
            temp[i]=arr[i];
           }
       	  System.out.println("New array is : ");
          for(int i=0;i<=n;++i)
           {
            System.out.print(temp[i]+"\t");
           }
        }  
  }
}