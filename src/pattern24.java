public class pattern24 {
    public static void main(String[]args){
                int i, j, k;
                for (i = 1; i <= 4; i++) {
                    for(k=1;k<=4-i;k++){
                        System.out.print(" ");
                    }
                    for(j=1;j<=2*i-1;j++){
                        System.out.print(j);
                    }
                    System.out.println();

                }

            }
}
