//logical AND operator

import java.lang.*;

class LogicalAND
{
  public static void main(String[] args)
  {
    float per=89.9f;
    String grade="FAIL";

    if(per>=90)
 	grade="A+";
    else if(per>=80 && per<90)
	grade="A";
    else if(per>=70 && per<80)
	grade="B+";
    else if(per>=60 && per<70)
	grade="B";
    else if(per>=50 && per<60)
	grade="C";
    else if(per>=40 && per<50)
	grade="D";

    System.out.println("Grade : "+grade);
  }
}