import java.util.Scanner;
public class tax{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("enter yor age");
int age = sc.nextInt();

System.out.println("enter yor income");
int income = sc.nextInt();
double tax;
double taxamount;
double taxx;

if(age<60 && income>50000 && age>=0){
tax = income*20/100;
taxamount=tax+income;
System.out.println("you total taxable amount is "+taxamount);
taxx=taxamount-income;
System.out.println("you total 20% tax  is "+taxx);
}

else if(age<60 && income<=50000 && age>=0){
tax = income*10/100;
taxamount=tax+income;
System.out.println("you total taxable amount is "+taxamount);
taxx=taxamount-income;
System.out.println("you total tax  10% is "+taxx);
}

else if(age>=60 && income>50000 && age>=0){
tax = income*15/100;
taxamount=tax+income;
System.out.println("you total taxable amount is "+taxamount);
taxx=taxamount-income;
System.out.println("you total 15% tax  is "+taxx);
}


else if(age>=60 && income<=50000 && age>=0){
tax = income*5/100;
taxamount=tax+income;
System.out.println("you total taxable amount is "+taxamount);
taxx=taxamount-income;
System.out.println("you total 5% tax  is "+taxx);
}




else{
	
	System.out.println("invalid no");
	
}








}


}