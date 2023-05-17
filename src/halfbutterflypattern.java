//this is the advance pattern one and it is a butterfly
public class halfbutterflypattern {
    public static void main(String[] args) {
        int n = 5;
        //this is upper half pattern
        for (int i = 1; i <= n; i++) {
            //left side star pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        //this is the lower half code
        for (int i =n-1; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}