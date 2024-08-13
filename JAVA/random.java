import java.util.Scanner;
import java.util.Random;
public class random {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     Random rand =new Random();

int random = rand.nextInt(100)+1;
int tries = 0;
int guess =0;
boolean won = false;



System.out.println("Welcome To No Gueesing Game");

System.out.println("I Have Selected A no Between 1 to 100 Try To Guess It");

while(!won){
    System.out.println("enter your guess");



guess=sc.nextInt();

tries++;
if(guess < 1 || guess > 100){

System.out.println("Invalid Guess");
}

else if(guess < random){
    System.out.println("Too low");
}
else if(guess > random){
    System.out.println("Too High");
}

else{
    won=true;
}
    }

System.out.println("You Won. You Guessed The No "+ random + " in " + tries + " tries ");




    }
}
