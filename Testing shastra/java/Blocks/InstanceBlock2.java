public class InstanceBlock2{
	
	public void instance(){
		
		System.out.println("Instance block");
		instance();
		
	}
	
	
	
	
	public static void main(String[] args){
	 InstanceBlock2 ib = new InstanceBlock2();
     System.out.println("Main Block");	 
	ib.instance();
		
		
	}
	
	
	
}

// This program will generate a infinite no of Intance block statement because after printing intance block it will again call the methode
// instance() and again it will print the statement and it will form a loop