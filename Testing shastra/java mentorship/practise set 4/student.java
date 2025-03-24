import java.util.Scanner;
public class student{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter attendence");
int attendace = sc.nextInt();
System.out.println("enter Score");
int score = sc.nextInt();

if(attendace<75){
System.out.println("Fail hogaya tu lode");
}else if(attendace>=75 && score>=60){

System.out.println("Pass hogaya bhai apna 😘😘😘");

}else{

System.out.println("Fail he mc");
}




}


}