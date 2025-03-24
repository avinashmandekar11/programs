//weekdays
//program to chech which no is greater between 3 no
import java.util.Scanner;
public class weekdays{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  nos BETWEEN 1 AND 7");
		
		System.out.println("enter no");
		int no1 = sc.nextInt();
		
		if(no1==1)
			System.out.println("Monday");
		else if(no1==2)
		System.out.println("Tuesday");
		else if(no1==3)
		System.out.println("Wednesday");
		else if(no1==4)
		System.out.println("THursady");
		else if(no1==5)
		System.out.println("Friday");
		else if(no1==6)
		System.out.println("Saturday");
		else if(no1==7)
			System.out.println("Sunday");
			else	
					System.out.println("Invalid no");

		
		
		
	}
	
	
	
	
	
	
}
		