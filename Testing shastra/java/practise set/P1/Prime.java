public class Prime {

    public static void main(String[] args) {
        int n=2;
        
        int remainder=0;
            if (  n==0 || n==1 ) {
                System.out.println("0 Or 1 therefore");
                
            }else{
                for(int i=2;i<n;i++){
                    if(n%i==0){
                        remainder=1;
						break;
                     }
                     }
               }
         if(remainder==0){
            System.out.println("prime");
           }
           else{
            System.out.println("not prime");
           }
        }
    
}