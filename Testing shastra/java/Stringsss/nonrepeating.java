// Non repeating characters from String

public class nonrepeating{
public static void main(String args[]){
	String s="heloo i am avinash";
	char ch[]=s.toCharArray();
	
	for(int i=0;i<ch.length;i++){
			
		if(ch[i]!=' '){
			boolean t=true;
		
			
			for(int j=0;j<ch.length;j++){
				
				if(ch[i]==ch[j] && i!=j){
					t=false;
					break;
				}
				
				
				
			
			
			}
			
				if(t){
				System.out.print(ch[i]);
				//break;   first non repeating character-------
			}
			
			
			
			
			
		}
		
		
		
		
		
	}
		
		
		
		
	}
	
	}


