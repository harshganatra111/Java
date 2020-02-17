import java.util.*;
class Student{
	Scanner sc = new Scanner(System.in);
	int i,regno;
	int mark[] = new int[5];
	String name;
	
	void getData(){
		
			System.out.println("Enter Name :");	
			name = sc.nextLine();
			System.out.println("Enter Reg No. :");
			regno = sc.nextInt();
			for(i=0;i<5;i++)
			{
				
				System.out.println("Enter marks in Subject "+ (i+1));
				mark[i] = sc.nextInt();
			}
			
		
		
	}
	 void showData()
	 {
		 System.out.println("Name = "+ name);
		 System.out.println("Reg NO. = " + regno);
		 for(i=0;i<5;i++)
		 {
			 System.out.println("Marks in Subject " + i+ " = " + mark[i]);
		 }
	 }
	 
}
public class SimpleProgram1 {

	public static void main(String[] args) {
		int i;
		System.out.println("Enter Student Details \n\n\n");
		
		
		Student obj[] = new Student[5];
		for(i=1;i<=5;i++)
		{
			obj[i] = new Student();
			System.out.println("Enter Details For Student " + i);
			obj[i].getData();
		}
		
		for(i=1;i<=5;i++)
		{
			obj[i] = new Student();
			System.out.println("Details For Student " + i);
			obj[i].showData();
		}
		

		
	}

}
