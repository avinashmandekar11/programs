//factorial
import java.util.Scanner;
public class factoriall{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter no to find factorial");
		int no1 = sc.nextInt();
		
		int factorial=1;
		
		while(no1>=1){
			
		factorial=no1*factorial;
		
		no1=no1-1;
		
		
		}
		System.out.println(factorial);
		
		}
		
		
}		