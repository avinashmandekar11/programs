//program to take 5 no and find their sum and average
import java.util.Scanner;
public class sum{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 5 nos");
		
		System.out.println("enter no 1");
		int no1 = sc.nextInt();
		
		System.out.println("enter no 2");
		int no2 = sc.nextInt();
		
		System.out.println("enter no 3");
		int no3 = sc.nextInt();
		
		System.out.println("enter no 4");
		int no4 = sc.nextInt();
		
		System.out.println("enter no 5");
		int no5 = sc.nextInt();
		
		int Sum= no1+no2+no3+no4+no5;
		System.out.println("Sum is : "+Sum);
		
		double avrg = Sum/5 ;
		System.out.println("Average is : "+avrg);
		
		
		}
		
 }