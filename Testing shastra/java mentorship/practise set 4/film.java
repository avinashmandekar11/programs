import java.util.Scanner;
public class film{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 if your ganere is Fiction \n Enter 2 if your ganere is Non Fiction");
int genre = sc.nextInt();

System.out.println("Enter your age");
int age = sc.nextInt();


if(genre==1 && age<=16 && age>0 ){

System.out.println("Harry potter");

}
else if(genre==1 && age>=16 )
{

System.out.println("The Great Gatsby");


}

else if(genre==2 && age<=16 )
{

System.out.println("The Magic School Bus");


}else if(genre==2 && age>=16 )
{

System.out.println("Sapiens");


}else{
System.out.println("Invalid Age or Genere NO");


}


}



}