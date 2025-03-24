

/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    * 
	
	*/






public class triangle{
public static void main(String args[]){

for(int i=1;i<=5;i++){
for(int spaces=1;spaces<=5-i;spaces++)
{
System.out.print(" ");
}

for(int j=1;j<=2*i-1;j++){

System.out.print("*");
}
System.out.println();
}

for(int i=4;i>=0;i--){
for(int spaces=1;spaces<=5-i;spaces++)
{
System.out.print(" ");
}

for(int j=1;j<=2*i-1;j++){

System.out.print("*");
}
System.out.println();
}

}


}