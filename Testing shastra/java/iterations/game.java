// no guessing game

import java.util.Scanner;
public class game{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int randomno=7;
		System.out.println("YOu only have 10 canses");
		
		while(num<=10)
		{
			
			
			System.out.print("Enter you no :  ");
			int no = sc.nextInt();
		
		if(no==randomno){
				System.out.println("correct guess "+randomno);
		        break;
		}
			else{
			System.out.println("Wrong guess ");
			
			
			}
		   
			num=num+1;
			
			}
		 System.out.println("Chanses completed");
		
		
		
	}
	
	
	
	
	
}