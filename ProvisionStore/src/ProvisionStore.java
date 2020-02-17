import java.util.Scanner;
class Store{
	int i,cnt=0;
	String StoreName = "Provision Store";
	String Item[] = {"Item1","Item2","Item3","Item4"};
	float price[] = {100,110,120,130},GTotal=0;
	int inp,n,j;
	Scanner sc = new Scanner(System.in);
	int qty[] ;
	String SelectedItem[];
	float SelectedItemPrice[];
	void DisplayItem(){
			System.out.println("S.N.   Item\t\tPrice");
		for(i=0;i<4;i++){
			System.out.println((i+1) +".     "+ Item[i]	+ "\t\t"+ price[i]);
		}
		Selected();
	}
	void Selected(){
		System.out.println("How many items you want to purchase : ");
		n = sc.nextInt();
		qty = new int[n];
		SelectedItem = new String[n];
		SelectedItemPrice = new float[n];
		for(j=0;j<n;j++){
		System.out.println("Enter your choice");
		inp = sc.nextInt();
		GenerateBill(inp);
		}	
	}
	void GenerateBill(int input){
		switch(input){
		 case 1:
			SelectedItem[cnt] = Item[0];
			SelectedItemPrice[cnt] = price[0];
			System.out.println("Enter Quantity for " + Item[cnt]);
			qty[cnt] = sc.nextInt();
			cnt++;
			break;
		 case 2:
				SelectedItem[cnt] = Item[1];
				SelectedItemPrice[cnt] = price[1];
				System.out.println("Enter Quantity for " + Item[cnt]);
				qty[cnt] = sc.nextInt();
				cnt++;
				break;	
		 case 3:
				SelectedItem[cnt] = Item[2];
				SelectedItemPrice[cnt] = price[2];
				System.out.println("Enter Quantity for " + Item[cnt]);
				qty[cnt] = sc.nextInt();
				cnt++;
				break;
		 case 4:
				SelectedItem[cnt] = Item[3];
				SelectedItemPrice[cnt] = price[3];
				System.out.println("Enter Quantity for " + Item[cnt]);
				qty[cnt] = sc.nextInt();
				cnt++;
				break;		
		default :
			i--;
			System.out.println("Invalid Input !!!!");
		}
	}
	void ShowBill(){
		System.out.println("\t\t\t\tProvision Store");
		System.out.println("\t\t\t\t===============");
		System.out.println("\t\t\t\t      Bill\n");
		System.out.println("\t\t   ItemName  \tQuantity\tPrice\tTotal ");
		for(i=0;i<n;i++){
			System.out.println("\t\t   "+ Item[i] + " \t   " + qty[i] + "\t\t" + SelectedItemPrice[i] + "\t" + (qty[i]*SelectedItemPrice[i]) );
			GTotal += (qty[i]*SelectedItemPrice[i]);
		}
		System.out.println("\t\t  --------------------------------------------");
		System.out.println("\t\t   GTotal    \t\t\t\t"+GTotal);
	}
}
public class ProvisionStore {
	public static void main(String[] args) {
		Store obj = new Store();
		obj.DisplayItem();
		obj.ShowBill();
	}
}