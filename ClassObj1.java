//class and object

import java.io.*;

class Books1
{
   //instance variables
   int bookid;
   String bookname;
   double bookprice, qty;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

   void getDetails() throws IOException
   {
      System.out.print("Enter Book Id : ");
      bookid=Integer.parseInt(br.readLine());
      System.out.print("Enter Book Name : ");
      bookname=br.readLine();
      System.out.print("Enter Book Price : ");
      bookprice=Double.parseDouble(br.readLine());
      System.out.print("Enter Quantity : ");
      qty=Double.parseDouble(br.readLine());      
   }

   void display()
   {
      System.out.println("--------------------");
      System.out.println("Book Order Details");
      System.out.println("--------------------");
      System.out.println("Book Id : "+bookid);
      System.out.println("Book Name : "+bookname);
      System.out.println("Book Price : "+bookprice);
      System.out.println("Quantity : "+qty);
      System.out.println("Total Price : "+(qty*bookprice));
   }    
}
class ClassObj1
{
  public static void main(String[] args) throws IOException
  {
      Books1 bk1=new Books1();
      bk1.getDetails();
      bk1.display();
  }
}