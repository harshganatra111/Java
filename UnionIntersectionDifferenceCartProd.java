//Union, Intersection, Difference, and Cartesian Product
import java.io.*;
class UnionIntersectionDifferenceCartProd
{
  public static void main(String[] args) throws IOException
   {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter size for set 1 : ");
    int n1=Integer.parseInt(br.readLine());
    System.out.print("Enter size for set 2 : ");
    int n2=Integer.parseInt(br.readLine());
    int arr1[]=new int[n1];
    int arr2[]=new int[n2];
    System.out.println("Enter elemets for set 1 :");
    for(int i=0;i<n1;i++)
     {
       arr1[i]=Integer.parseInt(br.readLine());
     }
    System.out.println("Enter elemets for set 2 :");
    for(int i=0;i<n2;i++)
     {
       arr2[i]=Integer.parseInt(br.readLine());
     }
    System.out.println("1. Union\n2. Intersection\n3. Difference\n4. Cartision Product");
    int ch=Integer.parseInt(br.readLine());
    
     switch(ch)
     {
      case 1:
        System.out.println("Union of set 1 and set  is : ");
        for(int i=0;i<n1;i++)
          System.out.print(arr1[i]+"\t");
        for(int i=0;i<n2;i++)
          System.out.print(arr2[i]+"\t");
        break;
      case 2:
         int count=0;
         System.out.println("Intersection of set 1 and set 2 is : ");
         for(int i=0;i<n1;i++)
          {
            for(int j=0;j<n2;j++)
             {
               if(arr1[i]==arr2[j])
                {
                  System.out.print(arr2[j]+"\t");
                  ++count;
                }
             }
          }
          if(count==0)
           {
             System.out.println("No common elements between set 1 and set 2.");
           }
          break;
        case 3:
	  for(int i=0;i<n1;i++)
           {
             for(int j=0;j<n2;j++)
              {
                if(arr1[i]==arr2[j])
		  {
                     arr2[j]=arr2[j+1];
                     break;
		  }
                  else
                  {
                     System.out.print(arr1[i]);
                     break;
                  }
              }
	    // System.out.print(arr1[i]+"\t");
           }
           break;
         //case 4:  
     }
   }
}