//to check divisible by 3,5,15
import java.util.Scanner;
public class divisible{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter no");
		int no1 = sc.nextInt();
		
		if(no1%3==0 && no1%5==0)
			System.out.println("divisible by 3,5,15");
		else if(no1%3==0)
		System.out.println("divisible by 3");
		else if(no1%5==0)
		System.out.println("divisible by 5");
		else
		System.out.println("not divisible by 3 5 and 15");
		}
		}