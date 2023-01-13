package JavaBasics;
import java.util.*;

public class exercise {
    public static void main (String[]args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("It's negative number");
        
        }
        else {
            System.out.println("it's a positive number");
        }
        System.out.println("enter a number between 1-7");
        int b = sc.nextInt();
        switch (b){
            case 1 : System.out.println("monday");
                       break;
            case 2 : System.out.println("tuesday");
                       break;
            case 3: System.out.println("wednesday");
                       break;
            case 4 : System.out.println("thursday");
                       break;
            case 5 : System.out.println("friday");
                       break;
            case 6 : System.out.println("saturday");
                       break;
            case 7 : System.out.println("sunday");
                       break;
            default : System.out.println("this is not inbetween 1 and 7");
        }
        for(int line=1;line<=5;line++){
            for (int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();


        }

    }
    
}
