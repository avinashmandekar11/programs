//program to calculate simple interest
import java.util.Scanner;
public class interest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter initial principal balanse");
		int P =sc.nextInt();
		
		System.out.println("enter anual interest rate");
		int r =sc.nextInt();
		
		System.out.println("enter time in years");
		int time=sc.nextInt();
		
		int A = P*(1+r*time);
		
		System.out.println("final amount is : "+A);
		
		
		
	}
	
	
	
	
}