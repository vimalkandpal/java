import java.util.*;
public class palendrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name:");
        String name=sc.nextLine();
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
        if(name.equals(rev)){
            System.out.println("it is a palindrome ");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
}
