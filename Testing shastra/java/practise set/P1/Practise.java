import java.util.*;
public class Practise {
    public static void main(String[] args) {
        System.out.println("Enter a number to reverse  ");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
       int sum=0;
       int Orignalno=no;
        while (no>0) {
            int r;
            r=no%10;
            sum=sum+r*r*r;
            no=no/10;
        }

        // if(sum==Orignalno){
        //     System.out.println("no is armstrong");
        // }
        // else
        // System.out.println("no is not armstrong");
        String ans=sum==Orignalno ? "armstrong" : "not armstrong";
        System.out.println(ans);
        sc.close();
    }
}
                                                                                               