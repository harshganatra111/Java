//1D array

import java.util.Scanner;

class Array1D
{
  public static void main(String[] args)
  {
    int arr[]=new int[5];
    arr[0]=10;
    arr[1]=20;
    arr[2]=30;
    arr[3]=arr[4]=40;

    System.out.println(arr[0]+"|"+arr[1]+"|"+arr[2]+"|"+arr[3]+"|"+arr[4]);

    //array initialization
    int ar[]={100,200,300,400,500};
    System.out.println(ar[0]+"|"+ar[1]+"|"+ar[2]+"|"+ar[3]+"|"+ar[4]);
    System.out.println("Length of ar="+ar.length); //length attribute returns the no. of rows in an array

    //user input
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no of elements : ");
    int size=sc.nextInt();

    //array declaration
    int a[]=new int[size];
    
    //inserting array elements through user input
    for(int i=0;i<size;++i) 
    {
	a[i]=sc.nextInt();
    }

    //displaying array elements
    for(int i=0;i<size;++i)
    {
      System.out.println("a["+i+"]="+a[i]);
    }
  }
}