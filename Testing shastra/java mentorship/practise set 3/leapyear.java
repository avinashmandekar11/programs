//leap year
import java.util.Scanner;
public class leapyear{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year");
		double year = sc.nextDouble();
		   
		   
		   if(year%400==0 )
			System.out.println("a leap year");
		    else if((year%4==0)&&  (year%100!=0))    // you can you && and || in same line
			System.out.println("Leap year");
		    else
			System.out.println("not a leap year");
		
	}
}