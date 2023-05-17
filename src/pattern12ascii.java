public class pattern12ascii {
    public static void main(String[]args){
        int i,j;
        char k;
        for(i=1;i<=5;i++) {
            for (j =1; j>=i+1; j++) {
                System.out.print("");
            }
            for (k = 69; k >= 65 ; k--) {
                System.out.print(k);
            }

            System.out.println();
        }
    }


}