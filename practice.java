package JavaBasics;
import java.util.*;

public class practice {
    public static void main(String[]args)
    {
     Scanner ab = new Scanner (System.in);
     System.out.println("enter a:");
     int a = ab.nextInt();
     System.out.println("enter operator");
     char character = ab.next().charAt(0);
     System.out.println("enter b:");
     int b = ab.nextInt();

     switch (character) {
        case '+' : System.out.println(a+b);
                   break;
        case  '-': System.out.println(a-b);
                   break;
        case '/' : System.out.println(a/b);
                   break;
        case '*' : System.out.println(a*b);
                   break;
        case '%' : System.out.println(a%b);
                   break;
        default  : System.out.println("enter correct operator");
     }
    }
        

     
     

     
    
}
