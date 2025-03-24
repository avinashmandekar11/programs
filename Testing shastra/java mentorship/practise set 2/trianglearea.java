//Program to calculate Area of Triangle;
// double Area= 1/2*(B*H);
import java.util.Scanner;
public class trianglearea{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of Triangle");
		int H = sc.nextInt();
				System.out.println("Enter Breadth of triangle");
				int B = sc.nextInt();
				
        // double Area= (1.0/2)*B*H;        ORR
		double Area= (0.5)*B*H;
		   

						System.out.println("Area of Triangle is "+Area);

		
		
	}
	
	
	
	
}