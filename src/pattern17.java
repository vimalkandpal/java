
public class pattern17 {
    public static void main(String[] args) {
        int i, j;
        //this is the first pattern
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        //this is the second pattern of same logic
        int k, l;
        for (k = 5; k >= 1; k--) {
            for (l = 1; l <= k; l++) {
                System.out.print(k);
            }
            System.out.println();
        }
        //this is the third pattern for same logic
        int m, n;
        for (m = 5; m >= 1; m--) {
            for (n = 1; n <= m; n++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
