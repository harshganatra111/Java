//student info

import java.io.*;

class Student
{
   int rollno;
   String name;
   int eng,phy,chem,math,bio,total;
   double per;
   char grade;
   void getdetails() throws IOException
    {
      
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter Student's roll number : ");
      rollno=Integer.parseInt(br.readLine());
      System.out.print("Enter Student's name :");
      String name=br.readLine();
      System.out.print("Enter marks in English :");
      eng=Integer.parseInt(br.readLine());
      System.out.print("Enter marks in physics :");
      phy=Integer.parseInt(br.readLine());
      System.out.print("Enter marks in Chemistry :");
      chem=Integer.parseInt(br.readLine());
      System.out.print("Enter marks in Mathematics :");
      math=Integer.parseInt(br.readLine());
      System.out.print("Enter marks in Biology :");
      bio=Integer.parseInt(br.readLine());   
      total=eng+phy+chem+math+bio;
      
      per=total/5;

    
      if(per>=81)
         grade='A';
      else if(per<81 && per>=61)
         grade='B';
      else
         grade='c';
        
    }
   void showdetails()
    {
      System.out.println("Roll no. : "+rollno);
      System.out.println("Name :"+name);
      System.out.println("English marks : "+eng);
      System.out.println("Physics marks : "+phy);
      System.out.println("Chemistry marks : "+chem);
      System.out.println("Mathematics marks : "+math);
      System.out.println("Biology marks : "+bio);
      System.out.println("Total marks : "+total);
      System.out.println("Percent :"+per+"%");
      System.out.println("Grade : "+grade);

    }
}

class CallStudent
{
  public static void main(String[] args) throws IOException
   {
     Student obj=new Student();
     obj.getdetails();
     obj.showdetails();
   }
}