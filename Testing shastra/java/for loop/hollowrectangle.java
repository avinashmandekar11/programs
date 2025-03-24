//               asterik
//               ||
//               1   2   3   4   5 
//                  
//               *   *   *   *   *        <-    line = 1
//                              *        <-    line = 2
//               *               *        <-    line = 3
//               *               *        <-    line = 4
//               *   *   *   *   *        <-    line = 5 ,n

// line=6
// asterik=6
// if line=1 || line=n  || asterik==1 || asterik==n

















//import java.util.*;
public class hollowrectangle {
   public static void main(String[] args) {
                                                                                      // Scanner sc = new Scanner(System.in);
    System.out.println("enter no of lines");
     int n=5;                                                                              //int n=sc.nextInt();
   // int i;
    for(int line=1;line<=n;line++){
   
        for(int asterik=1;asterik<=n;asterik++){
             if(line==1 ||  line==n  || asterik==1 || asterik==n){
            System.out.print("* ");
         }else{
             System.out.print("  ");
         }
         }
        
         System.out.println();
    }
//sc.close();
    } 
}
