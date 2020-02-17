// addition and substraction of matrix

import java.io.*;
 
class AddSub
{
  public static void main(String[] args) throws IOException
  {
    System.out.print("Enter  number of rows : ");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int r=Integer.parseInt(br.readLine());
    System.out.print("Enter  number of Columns : ");
    int c=Integer.parseInt(br.readLine());
    System.out.println("Enter Elements for Array 1"); 
    int arr1[][]=new int[r][c];
    for(int i=0;i<r;++i)
      {
        for(int j=0;j<c;++j)
         {
          arr1[i][j]=Integer.parseInt(br.readLine());  
         }
      }
    System.out.println("Enter Elements for Array 2"); 
    int arr2[][]=new int[r][c];
    for(int i=0;i<r;++i)
      {
        for(int j=0;j<c;++j)
         {
          arr2[i][j]=Integer.parseInt(br.readLine());  
         }
      }  
    
     
     System.out.println("Addition of array 1 and Array 2 is : "); 
     for(int i=0;i<r;++i)
      {
        for(int j=0;j<c;++j)
         {
          System.out.print(arr1[i][j]+arr2[i][j]+"\t");  
         } 
     System.out.println(); 
      }
    System.out.println("Substraction of array 1 and Array 2 is : "); 
     for(int i=0;i<r;++i)
      {
        for(int j=0;j<c;++j)
         {
          System.out.print(arr1[i][j]-arr2[i][j]+"\t");  
         } 
     System.out.println(); 
      }
   }
}