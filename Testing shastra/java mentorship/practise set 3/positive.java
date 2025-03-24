//positive or negtive no
import java.util.Scanner;
public class positive{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no to check whether it is positive or negative");
		
		int no = sc.nextInt();
		
		if(no>0)
			System.out.println("no is positive");
		else if(no<0)
		System.out.println("no is negative");
	    else
			System.out.println("no is 0");
		
		
		
		
		
		
	}
	
	
	
	
	
	
}