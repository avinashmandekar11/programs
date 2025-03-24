//Swap between 2 no
																			//import java.util.Scanner;
public class swap{
	                                                                        //Scanner sc = new Scanner(System.in);
	
	int no1 =  5;                												//sc.nextInt();
	int no2 =  10;                                                             //sc.nextInt();
	
	public static void main(String[] args){
		System.out.println("enter 2 nos");
		
		swap s = new swap();
		swap s1 = new swap();
	   
		
		System.out.println("no1 "+s.no1);
		System.out.println("no2 "+s1.no2);
		
		s.no1 = s.no2;
		s1.no2 = s1.no1;
		
		System.out.println(" after swap no1 "+s.no1);
		
		
		System.out.println(" after swap no2 "+s1.no2);
		
	}
	
}