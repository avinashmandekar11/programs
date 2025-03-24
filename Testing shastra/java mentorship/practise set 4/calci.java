import java.util.Scanner;
public class calci{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no 1");
double n1 = sc.nextDouble();

System.out.println("Enter no2");
double n2 = sc.nextDouble();


System.out.println("Select NO ACCORDING TO USE \n1.ADD \n2.SUBSTRACT \n3.MULTIPLY \n4.EXIT");
int input;
input = sc.nextInt();
while(input!=4){
	
switch(input){

case 1:System.out.println("ADDITION IS "+(n1+n2));
break;

case 2:System.out.println("SUBSTRACTION IS "+(n1-n2));
break;

case 3:System.out.println("MULTIPLICATION IS "+(n1*n2));
break;

case 4:break;

}
System.out.println("Select NO ACCORDING TO USE \n1.ADD \n2.SUBSTRACT \n3.MULTIPLY \n4.EXIT");

input = sc.nextInt();

}
}
}





