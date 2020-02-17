//linear search
import java.io.*;

class LinearSearch
{
   public static void main(String[] args) throws IOException
   {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int n;
     System.out.print("How many elements do you want to enter :");
     n=Integer.parseInt(br.readLine());
     System.out.println("Enter "+n+" elements to the array : ");
     int arr[]=new int[n];
     for(int i=0;i<n;++i)
     {
      arr[i]=Integer.parseInt(br.readLine());
     }
     System.out.println("Enter element you want to search : ");
     int x=-1;
     int temp=Integer.parseInt(br.readLine());
     for(int i=0;i<n;++i)
     {
       if(arr[i]==temp)
        {
          x=i;
          break;
        }
       
     }
     if(x>=0)
      {
        System.out.println("Element found at "+(x+1)+" position.");
      }
      else
      {
        System.out.println("Element not found.");
      }

   }
}