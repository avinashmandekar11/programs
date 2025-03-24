// simple calculater
import java.util.Scanner;
public class calculater{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 2 number");
		double no1 = sc.nextDouble();
		double no2 = sc.nextDouble();
		
		System.out.println("****** MENU ******");
		System.out.println("1. ENTER 1 TO ADD NO \n 2. ENTER 2 TO SUB NO \n 3. ENTER 3 TO MULTIPLY NO \n 4. ENTER 4 TO DIVIDE NO \n	");
		
		int choice =sc.nextInt();
		switch(choice){
			
			case 1 : double addition = no1 + no2;
			         System.out.println("Addition is "+addition);
					 break;
					 
			case 2 : double sub = no1 - no2;
			         System.out.println("sub is "+sub);	
                     break;					 
		   
			case 3 : double mul = no1 * no2;
			         System.out.println("Multiplication is "+mul);
					  break;
			
			case 4 : double division = no1 / no2;
			         System.out.println("Division is "+division);
					  break;
			
			
			
		}
		
	}
	
	
	
	
}