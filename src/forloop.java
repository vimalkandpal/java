//this is for loop in java
//this code is to print any number table in java and number is asked from the user
import java.util.*;
public class forloop {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(n*i);
        }
    }
}
