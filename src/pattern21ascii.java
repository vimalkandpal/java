public class pattern21ascii {
    public static void main(String[]args){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print((char)(96+j));
            }
            System.out.println();
        }
    }
}
