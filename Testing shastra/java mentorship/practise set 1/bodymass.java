//Body mass index
import java.util.Scanner;
public class bodymass{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("*******PROGRAM TO CALCULATE BODY MASS INDEX*******");
		
		
		System.out.println("enter weight");
		double Weight=sc.nextDouble();
		
		System.out.println("enter height in meter");
		double height = sc.nextDouble();
		
		double BMI = Weight/(height*height);
		
		System.out.println("Total BMI is "+BMI);
		
	}
}