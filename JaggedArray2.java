import java.io.*;

class JaggedArray2
{
  public static void main(String[] args) throws IOException
  {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter number of array : ");
     int n=Integer.parseInt(br.readLine());
     int arr[][][]=new int[n][][];
     int index[][]=new int[n][2];
     for(int i=0;i<n;++i)
      {
        System.out.print("Enter number of rows for array "+(i+1)+" : ");
        int r=Integer.parseInt(br.readLine());
        System.out.print("Enter number of columns for array "+(i+1)+" : ");
        int c=Integer.parseInt(br.readLine());
        index[i][0]=r;
        index[i][1]=c;
        arr[i]=new int[r][c];
         System.out.print("Enter Elements for array"+(i+1)+" : ");
         for(int j=0;j<r;++j) 
          {
             for (int k=0;k<c;++k)
              {
               arr[i][j][k]=Integer.parseInt(br.readLine());
              }
          } 
      }
      System.out.println("The Jagged Array is : ");
     for(int i=0;i<n;++i)
      {
         for(int j=0;j<index[i][0];++j) 
          {
             for (int k=0;k<index[i][1];++k)
              {
               System.out.print(arr[i][j][k]);
              }
           System.out.println();
          } 
          
      }
/*    int arr[][][]=new int[2][][];
     arr[0]=new int[1][3];
     arr[1]=new int[2][2];

     arr[0][0][0]=10;
     arr[0][0][1]=20;
     arr[0][0][2]=30;

     arr[1][0][0]=40;
     arr[1][0][1]=50;
     arr[1][1][0]=60;
     arr[1][1][1]=70;
     
     System.out.println(arr[0][0][0]+" "+arr[0][0][1]+" "+arr[0][0][1]);
     System.out.println(arr[1][0][0]+" "+arr[1][0][1]);
     System.out.println(arr[1][1][0]+" "+arr[1][1][1]);
*/
  }
}