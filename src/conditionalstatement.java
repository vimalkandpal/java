//this code is for conditional statement in java

import java.util.*;
public class conditionalstatement {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        int num= sc.nextInt();
       //this is if-else conditional statement

        if(age>18){
            System.out.println("you can vote in election");

        }else{
            System.out.println("you can not vote in election");
        }

        //this code is to find odd and even numbers
        if(num%2==0){
            System.out.println("this is an even number");
        }
        else{
            System.out.println("this is an odd number");
        }
    }

}
