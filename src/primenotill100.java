public class primenotill100 {
        public static void main(String[]args){
        int num=100;
        int i,j;
        for(i=1;i<=num;i++){
            int count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
        }
}
