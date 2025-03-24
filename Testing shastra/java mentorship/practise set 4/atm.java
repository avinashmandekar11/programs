import java.util.Scanner;
public class atm{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int amount=sc.nextInt();
if(amount>=500)
{
System.out.println("Successfully withdraw");

}else if(amount<=500 && amount>=0){

System.out.println(" cannot withdraw that");
}
else{
System.out.println("invalid withdraw 0 or minus");
}




}


}