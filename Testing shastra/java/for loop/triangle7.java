public class triangle7 {
  
        public static void main(String[] args) {
            int n=5;
            for(int i=1;i<=n;i++){      //for line
    
                for(int j=1;j<=i;j++){      // for empty spaces i to n no 
                    System.out.print(" ");  
                }
                 
                for(int j=i;j<=n;j++){
                    System.out.print("*"+" ");
                }
    
    
                System.out.println();
            }
        }
    }
    

