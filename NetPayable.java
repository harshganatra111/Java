//accept the Basic Salary, HRA, EPF, ESI of an Employee and calculate the Net Payable Salary
 import java.util.Scanner;

class NetPayable
{
     public static void main(String[] args)
     {
	double Basic_Salary,HRA,EPF,ESI,Gross,Net_Payable;
	System.out.println("Enter Basic Salary : ");
	Scanner br=new Scanner(System.in);
	Basic_Salary=br.nextDouble();
	HRA=(Basic_Salary*10)/100;
	Gross=Basic_Salary+HRA;
	EPF=(Basic_Salary*12.5)/100;
	ESI=(Basic_Salary*4.75)/100;
	Net_Payable=Gross-(EPF+ESI);
	System.out.println("HRA :"+HRA);
	System.out.println("EPF :"+EPF);
	System.out.println("ESI :"+ESI);
	System.out.println("Gross :"+Gross);
	System.out.println("Net Salary of Employee is : "+Net_Payable);
     }
}
