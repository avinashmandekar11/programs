// to print occurence of each character in string 
public class OccurenceOfEachChracater{
	public static void main(String args[]){
		
		String s = "hello i am avinash";
		char[] ch =s.toCharArray();
		boolean visited[] =new boolean[ch.length];
		
		for(int i=0 ; i<s.length()-1;i++){
			
				int count =1;
				if(!visited[i] && ch[i]!=' '){
					for(int j=i+1;j<s.length();j++){
						if(ch[i]==ch[j]){
						visited[j]=true;
						count++;
						}
					}
					
					System.out.print(ch[i]+":"+count +"  ");
					
				}
				
			
		}
		
		
		
		
		
	}
	
	
	
}