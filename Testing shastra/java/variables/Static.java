public class Static {
	
	static int x = 10;
	
	public static void main (String[] args)
	{
		Static s = new Static();
		Static s1 = new Static();
		
		s.x = s.x + 20;   //60
		s1.x = s.x + 30;  //60
		
		System.out.println(s.x);
		System.out.println(s1.x);
		
		
		
	}
	
	
	
}