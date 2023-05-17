import java.util.*;
public class tableofanoaskedfromuser {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int sum=1;
        for(int i=1;i<11;i++){
             sum=n*i;
            System.out.println(n+"*"+i+"="+sum);
        }


    }

}
