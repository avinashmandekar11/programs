//program to chech which no is greater between 3 no
import java.util.Scanner;
public class greater{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 nos");
		
		System.out.println("enter no 1");
		int no1 = sc.nextInt();
		
		System.out.println("enter no 2");
		int no2 = sc.nextInt();
		
		System.out.println("enter no 3");
		int no3 = sc.nextInt();
		
		
		
		if(no1>no2 && no1>no3)
			System.out.println("no "+no1+" is greater");
		else if(no2>no1 && no2>no3)
		System.out.println("no "+no2+" is greater");
	    else
			System.out.println("no "+no3+" is greater");
				
		
		
		
		
	}
	
	
	
	
	
	
}
		