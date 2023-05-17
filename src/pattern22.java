public class pattern22 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
//this is the different pattern from same logic

        int l, m, n;
        for (l = 1; l <= 4; l++) {
            for (n = 1; n <= 4 - l; n++) {
                System.out.print(" ");
            }
            for (m = l; m >= 1; m--) {
                System.out.print(m);
            }
            System.out.println();
        }

    }
}

