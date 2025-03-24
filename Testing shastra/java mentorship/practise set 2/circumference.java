// program to calculate circumference of circle
// formula circumference=2*pie*R;
import java.util.Scanner;
public class circumference{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		int R=sc.nextInt();
		double pie = 3.14;
		
		double circumference = 2*pie*R;
		System.out.println(circumference);
		
		
	}
}