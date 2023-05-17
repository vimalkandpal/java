import java.util.Scanner;
    public class factorial {
        public static void main(String[] args) {
            int num, factorial = 1;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to calculate its factorial: ");
            num = sc.nextInt();
            sc.close();
            for(int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }





