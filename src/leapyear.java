public class leapyear {
    public static void main(String[]args){
        int num=1000;
        if(num%4==0&&num%100!=0||num%400==0){
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }
    }
}
