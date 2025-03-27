import java.util.*;
public class divisible25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no5");
        int no  =sc.nextInt();
        if(no%3==0 && no%5==0){
            System.out.println(no+" is divisible by 3 and 5 both");
        }else if(no%3==0){
            System.out.println(no+" is divisile by 3 only");
        }else if(no%5==0){
            System.out.println(no+" is divisible by 5 only");
        }else{
            System.out.println("Not divisible by 3 and 5");
        }



    }
}
