//compare two arrays

import java.io.*;

class Compare2
{
  public static void main(String[] args) throws IOException
   {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter number of elements for both the array : ");
     int n=Integer.parseInt(br.readLine());
     int arr1[]=new int[n];
     int arr2[]=new int[n];
     System.out.println("Enter elements for array 1 : ");
     for(int i=0;i<n;	i++)
      {
        arr1[i]=Integer.parseInt(br.readLine());
      }
     System.out.println("Enter elements for array 2 : ");
     for(int i=0;i<n;i++)
      {
        arr2[i]=Integer.parseInt(br.readLine());
      }
     int a=0;
     for(int i=0;i<n;i++)
      {
       if(arr1[i]==arr2[i])
         { 
           a++;
         }
      }
     if(a==n)
      {
        System.out.println("Both the arrays are equal.");
      }
     else
      {
        System.out.println("Both the arrays are not equal.");
      }
    }
}
