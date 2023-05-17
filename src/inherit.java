import java.util.Scanner;
    class A{
        int a,b;
        void input(){
            Scanner sc=new Scanner(System.in);
            System.out.println("ENter the value");
            a=sc.nextInt();
            System.out.println("ENter the value");
            b=sc.nextInt();
        }
    }
    class B extends A{
        void add(){
            System.out.println("addition is "+(a+b));
        }
    }
    class C extends A{
        void sub(){
            System.out.println("sub is "+(a-b));
        }
    }
    class inherit{
        public static void main(String[] args) {
            B bb=new B();
            C cc=new C();
            bb.input();
            bb.add();
            cc.input();
            cc.sub();
}

    }