//this is the advance pattern one and it is a butterfly
public class advancepattern1 {
    public static void main(String[] args) {
        int n = 5;
        //this is upper half pattern
        for (int i = 1; i <= n; i++) {
            //left side star pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //right side star pattern
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //this is the lower half code
        for (int i =n; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}