import java.util.Scanner;

public class ifelse{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int a = sc.nextInt();
		
		if(a>=0 && a<=18){
			System.out.println("under 18");
			
        /*	if(){
				
			}else(){
				
			}         Nested ifelse= loop inside a loop is called as nested loop */
		}
		
		else if(a<=0)
			System.out.println("Invalid age");
		
		else if(a > 100)
		    System.out.println("enter age under 100");	
		
		else if(a < 100)
		    System.out.println("over 18");	
		
		else
			System.out.println("enter range between 0 to 90");
		
	}
	
}