//remove dublicate values from an array
import java.io.*;
class RemoveDublicate
{
   public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter number of elements for the array : ");
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
	System.out.println("Enter elements to the array : ");
	for(int i=0;i<n;++i)
	  {
            arr[i]=Integer.parseInt(br.readLine());
	  }
	int temp[]=new int[n];
        int nxtidx=0;
	for(int i=0;i<n;i++)
	  { 
               int cnt=0,j;
               for(j=0;j<nxtidx;++j)
               {
		if(arr[i]!=temp[j])
                {
                   ++cnt;
                }
              }
                if(cnt==nxtidx)
                 {
  		   temp[nxtidx]=arr[i];
                   ++nxtidx;
                   System.out.println(temp[j]);
                 }

                   continue;
	}
         System.out.println("Array after deletion of dublicate elements is : ");
         for(int i=0;i<nxtidx;++i)
          {
            System.out.print(temp[i]+"\t");
          } 
    }
}