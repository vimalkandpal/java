//this is a pattern for numbers to print one after anoter
public class pattern8 {
    public static void main(String[]args) {
        int number=1;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();

        }
    }
}
