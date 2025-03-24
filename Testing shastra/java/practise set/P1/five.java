//5 no pattern
public class five{
public static void main(String args[]){
int no=7;
for(int n=1;n<=no;n++){

for(int j=1;j<=no;j++){
if(n==1||n==4||n==no||(j==1 && n<=4)||(j==no && n>=5))
System.out.print("* ");

else
System.out.print("  ");
}
System.out.println();

}




}


}