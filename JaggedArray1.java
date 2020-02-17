import java.lang.*;

class JaggedArray1
{
  public static void main(String[] args)
  {
     int arr[][][]=new int[2][][];
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
  }
}