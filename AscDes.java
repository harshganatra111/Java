//ascending , descending, min,max
import java.io.*;

class AscDes
{
  public static void main(String[] args) throws IOException
   {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
     System.out.print("Enter number of elements : ");
     int n=Integer.parseInt(br.readLine());
     int a=n+2;
     int arr[]=new int[a];
     
     System.out.println("Enter elements to the array : ");
     for(int i=0;i<n;++i)
      {
        arr[i]=Integer.parseInt(br.readLine());
      }
	 for(int i=0;i<n;i++) 
        {
            for(int j=i;j<n;j++) 
            {
                if(arr[i]>arr[j]) 
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                
                    
                }
            }
        }
      
      System.out.println("1. Ascending order");
      System.out.println("2. Descending order");
      System.out.println("3. Minimum");
      System.out.println("4. Maximum");
      System.out.print("Enter your choice : ");  
      int ch=Integer.parseInt(br.readLine());
      switch(ch)
       {
         case 1:
        
	 System.out.println("Array in Ascending order is : ");
         for(int i=0;i<n;i++)
         System.out.print(arr[i]+"\t");
         break;

         case 2:
         System.out.println("Array in Descending order is : ");
         for(int i=n-1;i>=0;i--)
         System.out.print(arr[i]+"\t");
         break;       
       case 3:
        {
          System.out.print("Minimum is : "+arr[0]);
          break;
        } 
       case 4:
        {
         System.out.print("Maximum is :"+arr[n-1]); 
        }
       }
      
   }
}