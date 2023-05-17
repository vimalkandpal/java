public class pattern13 {
    public static void main(String[]args){
        int i,j;
        int count=69;
        for(i=5;i>=1;i--){
            for(j=count;j>=count-i+1;j--){
                System.out.print((char)j);
            }
            count--;
            System.out.println();
        }
    }
}
