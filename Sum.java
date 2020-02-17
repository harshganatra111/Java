//constructor

class Sum
{
  Sum()
  {
    System.out.println("Default Constructor has been invoked.");
  }
  Sum(int a,int b)
  {
    System.out.println(a+"+"+b+"="+(a+b));
  }
  Sum(int a,int b,int c)
  {
    System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
  }
  Sum(double d1,double d2)
  {
     System.out.println(d1+"+"+d2+"="+(d1+d2));
  } 
}