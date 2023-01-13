package JavaBasics;
import java.util.*;
public class experiment 
{
    public static void main(String[] args)
    {
    
        int n = 16803 ;
        while (n>0){
            int lastdigit=n%10;
            n=n/10;
            System.out.print(lastdigit);
        }
        
        for (int m = 26302;m>0;m=m/10){
            int last=m%10;
            int reverse=0;
            reverse=(reverse*10)+last;
            System.out.print(reverse);


        }
        {Scanner sc = new Scanner(System.in);
            System.out.println("enter a number:");
        int b = sc.nextInt();
        int a = 1;
        do {
            System.out.println(a);
            a++;
        }while(a<=b);
    }
    }

    
    
}
