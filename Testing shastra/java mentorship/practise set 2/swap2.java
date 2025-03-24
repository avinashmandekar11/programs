// program to swap using only 2 variables
import java.util.Scanner;
public class swap2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no 1");
		int no1=sc.nextInt();
		
		System.out.println("enter no 2");
		int no2=sc.nextInt();
		
		System.out.println("no 1 is "+no1);
				System.out.println("no2 is "+no2);
		
		
		no1 = no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		
		System.out.println("no1 after swap is "+no1);
				System.out.println("no2 after swap is "+no2 );

		
		
	}
	
}