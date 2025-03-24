//Program to calculate Area and Perimeter of Rectangle;
//int Area = l*w;
// int perimeter = 2*(l+w);
import java.util.Scanner;
public class rectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length");
		int l=sc.nextInt();
				System.out.println("enter weight");

		int w = sc.nextInt();
		
		int Area = l*w;
        int perimeter = 2*(l+w);
		
		System.out.println("Area is "+Area);
		System.out.println("perimeter is "+perimeter);
	}
	
}