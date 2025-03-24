//floating no
//positive or negtive no
import java.util.Scanner;
public class floating{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no to check whether it is positive or negative");
		
		double no = sc.nextDouble();
		
		 if(no>1000000)
			System.out.println("no is large");
		else if(no>1)
			System.out.println("no is positive");
		else if(no<-1)
		System.out.println("no is negative");
	   
		   else if(no<1 && no>0)
			System.out.println("less than 1 and small");
			 else
			System.out.println("no is 0");
			
		
		
		
		
		
		
	}
	
	
	
	
	
	
}