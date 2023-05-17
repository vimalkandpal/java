import java.util.*;
public class inheritence {
    class A {
        int a, b;

        void inout() {
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            System.out.println("enter the value");
        }

        void add() {
            System.out.println("addition is" + (a + b));
        }
    }
    class B extends A{
        int c;
        void getdata(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the value:");
            c= sc.nextInt();
        }
        void display(){
            System.out.println("addition is"+(a+b+c));

        }

        class C{
            public static void main(String[]args){

            }
        }
    }

}
