// to check if a string is plindrome or not 

public class Spalindrome{

public static void main (String args[]){

	String s ="helleh";
	String reverse="";
	
	for(int i=s.length()-1;i>=0;i--){
		
		reverse+=s.charAt(i);
	}
		
		
		
		
		
		
		if(reverse.equals(s)){
		
		System.out.println("Palindrome");
		
		}else{
			System.out.println("Not palindrome");
		
		}


		}




	}