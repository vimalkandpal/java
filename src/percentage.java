import java.util.*;
public class percentage {
    int a,b,c;
    percentage(int x,int y,int z){
        int per;
        per=(x+y+z)/3;
        System.out.println("percentage of student 1 is :"+per);
    }
    void calculate(){
        int total;
        total=a+b+c;
        int perc=total/3;

    }
    public static void main(String[]args){
        int a1,b1,c1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the marks of maths:");
        a1=sc.nextInt();
        System.out.print("enter the marks of physics:");
        b1= sc.nextInt();
        System.out.print("enter the marks of chemistry:");
        c1= sc.nextInt();
        percentage s1=new percentage(a1,b1,c1);
    }

}
