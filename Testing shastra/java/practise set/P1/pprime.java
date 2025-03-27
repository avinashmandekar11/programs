public class pprime {

    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(i%n==0){
            return false;
            }
        }
             return true;
    }


    public static void main(String[] args) {
       System.out.println(isPrime(5)); 
    }
}
