//there is a need to break out from both the loop when sum of i and j is greater than 8
public class IandJ {
    public static void main(String[]args){
        int  i,j;
       first: for(i=1;i<10;i++){
            for(j=1;j<=5;j++){
                if(i+j>8){
                    break first;
                }
                System.out.println(i+j);
            }
        }
    }
}
