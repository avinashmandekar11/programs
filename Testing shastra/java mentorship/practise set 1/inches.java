// program to convert inches into meter
import java.util.Scanner;
public class inches{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter inches Between 1 And 25");
		int inches = sc.nextInt();
		System.out.println("you entered inches " +inches);
		Double meters = inches*0.0254;
		System.out.println("total meters "+meters);
		
		
		
		
	}
	
	
	
}