public class armstrong {
    public static void main(String[]args){
        int arm,x,num,r;
        System.out.println("the armstrong number betweeen 1 to 500 are given below");
        for(num=1;num<=500;num++){
            arm=0;
            x=num;
            while(x>0){
                r=x%10;
                arm=arm+r*r*r;
                x=x/10;

            }
            if(num==arm){
                System.out.println(arm);
            }
        }
    }
}
