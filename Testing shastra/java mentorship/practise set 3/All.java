import java.util.Scanner;
public class All {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter  Character");
Object a = sc.next().charAt(0);

System.out.println("Enter String");

//Object b = sc.nextLine();
Object b = sc.next();

String sum = (char)a+(String)b;

System.out.println(sum);

}
    
}
         