//reverse array
import java.io.*;

class RevArr
{
  public static void main(String[] args) throws IOException	
   {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter number of elements for the array : ");
     int n=Integer.parseInt(br.readLine());
     int arr[]=new int[n];
     System.out.println("Enter elements to the array : ");
     for(int i=0;i<n;i++)
      {
        arr[i]=Integer.parseInt(br.readLine());
      }     
     System.out.println("The array is : ");
     for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]+"\t");
      }
     System.out.println();
     System.out.println("Reverse of the array is : ");
     for(int i=n-1;i>=0;i--)
      {
        System.out.print(arr[i]+"\t");
      }
   }
}
