//this is a switch case statement in java
import java.util.*;
public class calculator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("enter 1 for add 2 for diff 3 for mul 4 for division");
        int  choice=sc.nextInt();

        switch(choice){
            case 1 :
               int sum=a+b;
                System.out.println(sum);
                break;
            case 2:
                int diff=a-b;
                System.out.println(diff);
                break;
            case 3:
                int mul=a*b;
                System.out.println(mul);
                break;
            case 4:
                int divi=a/b;
                System.out.println(divi);
                break;
        }
    }
}
