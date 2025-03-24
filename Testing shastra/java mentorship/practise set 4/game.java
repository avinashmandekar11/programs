import java.util.Scanner;
public class game{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no ");
double n1 = sc.nextDouble();

while(n1!=75){
if(n1<75){
System.out.println("higher no");
}
else if(n1>75){
System.out.println("lower no");
}
else{}


System.out.println("Enter no ");
 n1 = sc.nextDouble();
  if(n1==75){
System.out.println("Correct no "+n1);
}else{}


}
}
}