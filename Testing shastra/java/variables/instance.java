public class instance{
	int x = 10;
	
	public static void main (String[] args)
	{
		instance s = new instance();
		instance s1 = new instance();
		
		s.x = s.x + 20;   //30
		s1.x = s.x + 30;  //60
		
		System.out.println(s.x);
		System.out.println(s1.x);
		
		
		
	}
	
	
	
}