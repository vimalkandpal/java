//this is the code to print the sum  of fist n natural numbers in java
import java.util.*;
public class sumoffirstnnaturalno {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
