//diagonal matrix
import java.io.*;

class DiagonalMatrix
{
   public static void main(String[] args) throws IOException
   {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int r,c; 
    System.out.print("Enter number of rows : ");
    r=Integer.parseInt(br.readLine());
    System.out.print("Enter number of columns : ");
    c=Integer.parseInt(br.readLine());
    System.out.println("Enter elements to the array : ");
    
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
         {
           arr[i][j]=Integer.parseInt(br.readLine());
         }  
      }
     System.out.println("Elements in the array are : "); 
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
         {
           System.out.print(arr[i][j]+" ");
         }
        System.out.println();  
      }
     System.out.println("Diagonal elements are :");
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
         {
           if(i==j||i+j==(r-1)||i+j==(c-1)) 
             { 
               System.out.print(arr[i][j]);
             }
           else
             {
               System.out.print("0");
             }
         }
        System.out.println();  
      }
   }  
}