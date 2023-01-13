package JavaBasics;
import java.util.*;


public class hello
{
// exercise 1
    public static void main(String[] args)
    {Scanner abc = new Scanner(System.in);
        float celcius_temp = abc.nextFloat();
        float fahrenheit = (celcius_temp - 32) * 5/9; 
        System.out.println(fahrenheit);
        
// exercise 2
        int income = abc.nextInt();
        int tax ;
        if (income < 30000){
            tax = 0;
            System.out.println("you are taxed around " + tax );
        } 
        if (income >30000){
            tax = (int) (income * 0.2);
            System.out.println("you are taxed around " + tax );
        }
// exercise 3
        int number = abc.nextInt();
        String answer = number > 50 ? " number bigger than 50" : "smaller than 50";
        System.out.println(answer);

    }      
}   

