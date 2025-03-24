import java.util.Scanner;
public class purchase{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter purchase amount");
double amount=sc.nextInt();
double discount=0;

if(amount>=3000){
System.out.println("price is "+amount);
discount=amount*20/100;
amount=amount-discount;
System.out.println("discounted price is "+amount);
}else if(amount>=500 && amount<3000){
	System.out.println("price is "+amount);
discount=amount*10/100;
amount=amount-discount;
System.out.println("discounted price is "+amount);
}
else{
	System.out.println("Amount is less than 500 no discount");
}
}
}