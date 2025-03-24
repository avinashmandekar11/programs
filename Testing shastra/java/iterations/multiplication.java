//multiplication table
import java.util.Scanner;
public class multiplication{
public static void main(String[] args){
	
Scanner sc = new Scanner(System.in);
 System.out.println("enter a no");
 
int no = sc.nextInt();
int num=1;

System.out.println("your table of "+no+"is :");
while(num<=10)
{
	
 int ans = no*num;
 System.out.println(ans);
 num=num+1;


}






}


}