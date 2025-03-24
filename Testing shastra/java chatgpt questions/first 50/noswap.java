import java.util.Scanner;
public class noswap {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter a no of a and b");



int a = sc.nextInt();
int b = sc.nextInt();

a=a+b;

b=a-b;
a=a-b;

System.out.println(a);
System.out.println(b);




}
    
}
