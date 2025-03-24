public class StaticBlock{



static int m1 ;

static{
System.out.println("Hello M1") ;
}

public static void main(String[] Av){


System.out.println(m1);


}



}














/*

public class StaticBlock {

    static int m1; // Declare m1 as a static variable at class level

    static {
        m1 = 10; // Initialize m1 in the static block
    }

    public static void main(String[] args) {
        System.out.println(m1); // Now you can access m1
    }
}




*/