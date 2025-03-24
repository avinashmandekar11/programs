//Plaindrome no n 
public class palindrome{
	public static void main(String args[]){
		
		int n=1334331;
		int sum=0;
		int r;
		int temp=n;
		while(n>0){
			
			r=n%10;                //get last digit out
			sum=(sum*10)+r;       // to add r again to get result 
			n=n/10;               //remove last digit
			
			}
			if(sum==temp)
				System.out.println("Plaindrome");
		
		else
				System.out.println("Not Plaindrome");
		
		
		
	}
}