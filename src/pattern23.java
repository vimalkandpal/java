public class pattern23 {
    public static void main(String[]args){
                int i, j, k;
                for (i = 1; i <= 5; i++) {
                    for(k=1;k<=5-i;k++){
                        System.out.print(" ");
                    }
                    for(j=1;j<=i;j++){
                        System.out.print(" "+j);
                    }
                    System.out.println();

                }
//this is the second pattern from same logic
        int m,n,o;
                for(m=5;m>=1;m--){
                    for(o=1;o<=5-m;o++){
                        System.out.print(" ");
                    }
                    for(n=1;n<=m;n++){
                        System.out.print(n+" ");
                    }
                    System.out.println();
                }

            }
}
