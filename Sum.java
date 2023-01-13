package JavaBasics;
import java.util.Scanner;



public class Sum 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int sum =0;

        for(int i =0;i<=a;i++)
        {
            sum = sum+i;
        }

        System.out.println("the sum of natural numbers till "+a + " =");
        System.out.println(sum);
        for (int line= 1;line <=4;line++ )
        {
            System.out.println("****");
        }

    }
    
}
