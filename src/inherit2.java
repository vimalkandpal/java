import java.util.*;
class M{
    int a=10;
    void wish(){
        System.out.println("good morning");
    }
}
class N extends A{
    void wish(){
        System.out.println("good night");
    }
}
public class inherit2 {
    public static void main(String[]args){
        final int a=10;
        System.out.println(a);
        N bb=new N();
        bb.wish();
    }

}
