public class first{
	public static void main(String args[]){
		int i=5,j=6;
		int r = i++ + j; // + will be done first and then incement will be done 
		//int r = i++ + j + ++i;
		System.out.println(r);//11    18
				System.out.println(i);//6    7
				System.out.println("Other");
				System.out.println('5'+'6');//107  because it follows unicode standard 5 is now a charcter defined in singe quote and its unicode value will be printed
               System.out.println("5"+"6"); //56
		               System.out.println(5+"6"); //56
					                  System.out.println(5+'6'); //59
									  System.out.println(5+6); //11


	}
	
	
}

class first1{
			
		public static void main(String args[]){

int i=5,j=6;
		//int r = ++i + j; // + will be done first and then incement will be done 
		//int r = i++ + j + ++i ;
		//int r = i++ + j + ++i + i++;
		int r = ++i + j + j++ + i + ++j ;
		
		System.out.println(r);//11
				System.out.println(i);//6
               System.out.println(j);

	
		}	
}



