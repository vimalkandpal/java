import java.util.*;
public class capitalsmall {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter tha name:");
        String name =sc.nextLine();
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.print(Character.toLowerCase(ch));
            }
            else{
                System.out.print(Character.toUpperCase(ch));
            }
        }
    }
}
