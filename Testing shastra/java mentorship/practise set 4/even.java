import java.util.Scanner;
public class even{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter No");
int no = sc.nextInt();

if(no%2==0 && no>0){

System.out.println("Even no "+no);


}else if(no%2!=0 && no>0){

System.out.println("Odd No "+no);
}else if(no%2==0 && no<0){

System.out.println("Negative EVen No "+no);
}
else if(no%2!=0 && no<0){

System.out.println("Negative Odd No "+no);
}
else{
System.out.println("no is ZERO 0");

}




}


}