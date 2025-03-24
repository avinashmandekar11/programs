import java.util.*;
public class discount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter price of 3 items");

int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

sc.nextLine();
double discountt=0 ;

System.out.println("Enter membership Regular , Silver , Gold , platinum");

String member=sc.nextLine();

switch(member){
case "Regular": discountt = 0;
break;
case "Silver": discountt = 5;
break;
case "Gold": discountt = 10;
break;
case "Platinum": discountt = 15;
break;

default : System.out.println("Wrong member");
}

int total=a+b+c;
double formula=(total)*(discountt/100);
double discountedprice = total - formula;
System.out.println("discount  "+ discountt + "    total  "+total+"  discounted price  "+discountedprice);
    }
}