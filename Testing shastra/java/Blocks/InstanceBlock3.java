public class InstanceBlock3{
	
	{
		
		System.out.println("Instance block");
		
	}
	
	public void m1(){
	
	System.out.println("m1 block");
	}
	
	
	
	public static void main(String[] args){
	 InstanceBlock3 ib = new InstanceBlock3();
     System.out.println("Main Block");	 
	ib.m1();
		
		
	}
	
	
	
}