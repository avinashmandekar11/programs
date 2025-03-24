public class fibonachi {
    public static void main(String[] args) {
        /* int a=10;
        int b=0;
        int n=1;
        int d;
        for(int c=0;c<a;c++)
        { System.out.println(b);
            d=b+n;
            b=n;
            n=d;
            
           
        } */


		 int a=10;
        int first=0;
        int second=1;
        int total=0;
		System.out.println(first);System.out.println(second);
		for(int c=3;c<a;c++)
        { 
            total=first+second;
			System.out.println(total);
            first=second;
            second=total;
            
           
        }


    }
}
