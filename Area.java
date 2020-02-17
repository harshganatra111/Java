//area

import java.util.Scanner;


class CalcArea
{
	
    Scanner sc=new Scanner(System.in);
	void menu()
	{
		   System.out.println("   ----");
		   System.out.println("   Area");
		   System.out.println("   ----");
		   System.out.println("1. Circle");
		   System.out.println("2. Square");
		   System.out.println("3. Reactagle");
		   System.out.println("4. Cylinder");
		   System.out.println("5. Sphere");
		   System.out.println("0. Exit");
		   System.out.println("Enter your choice");
	}
   
   void circle()
    {
      int radius;
      System.out.print("Enter radius of circle : ");
      radius=sc.nextInt();
      double area=(3.14*radius*radius);
      System.out.println("Area of circle is : "+area);
    }
   void square()
    {
      
      int side;
      System.out.print("Enter side of Square : ");
      side=sc.nextInt();
      double area=(side*side);
      System.out.println("Area of Square is : "+area);
    }
   void rectangle()
    {

       int length,breadth;
       System.out.print("Enter length of rectangle : ");
       length=sc.nextInt();
       System.out.print("Enter breadth of rectangle : ");
       breadth=sc.nextInt();   
       double area=(length*breadth);
       System.out.println("Radius of reactangle is : "+area);
  
    }
   void cylinder()
    {


      int height,radius;
      System.out.print("Enter height of rectangle : ");
      height=sc.nextInt();
      System.out.print("Enter radius of rectangle : ");
      radius=sc.nextInt();   
      double area=(2*3.14*radius*(height+radius));
      System.out.println("Radius of cylinder is : "+area); 
    }
   void sphere()
    {
      int radius;
      System.out.print("Enter radius of Sphere : ");
      radius=sc.nextInt();
      double area=(4*3.14*radius*radius);
      System.out.println("Area of sphere is : "+area);
    }
}
     
class Area
{ 
       
   public static void main(String[] args) 
    {
      Scanner scr=new Scanner(System.in);
	CalcArea obj=new CalcArea();
    while(true) 
     {
        obj.menu();
	int ch=scr.nextInt();
   
     switch(ch)
       {
      case 0:
      {
        System.exit(0);
      }
      case 1:
      {
    	  obj.circle();
    	  break;
      }
      case 2:
      {
    	  obj.square();
    	  break;
      }
      case 3:
      {
    	  obj.rectangle();
    	  break;
      }
      case 4:
      {
    	  obj.cylinder();
    	  break;
      }
      case 5:
      {
    	  obj.sphere();
    	  break;
      }
      default:
       {  
         System.out.println("Invalid Input.....!!!!");
       }
      }  
     }
    }
}