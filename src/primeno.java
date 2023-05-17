import java.util.*;
public class primeno {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int i;
        int count=0;
        for (i=1;i<=num;i++) {
            if (num % i == 0) {
                count++;
            }
        }
            if(count==2){
                    System.out.println("it is a prime number");
                }
            else{
                System.out.println("not a prime number");
            }

    }
}
