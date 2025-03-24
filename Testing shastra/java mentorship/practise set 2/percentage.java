//percentage of student 5 subjects
import java.util.Scanner;
public class percentage{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter marks of 5 subjectsto find percentage ");
		
				System.out.println(" enter marks of math ");
                 int math=sc.nextInt();
		
		System.out.println(" enter marks of java ");
                 int java=sc.nextInt();
		
		
		System.out.println(" enter marks of selineium ");
                 int sel=sc.nextInt();
		
		System.out.println(" enter marks of javascript ");
                 int js=sc.nextInt();
		
		
		System.out.println(" enter marks of Html ");
                 int html=sc.nextInt();
		
		
		
		double percentage=(math+java+sel+js+html)/5;
		
		
		System.out.println("Your total percentage is : "+percentage);
		
		
	}
	
	
	
}