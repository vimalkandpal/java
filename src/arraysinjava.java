import java.util.*;
public class arraysinjava {
    public static void main(String[] args) {
        //there are three ways to create an array
        int [] marks=new int[5];
        //this is the first way to create an array butt it is a long method
        marks[0]=90;
        marks[1]=80;
        marks[2]=70;
        marks[3]=60;
        marks[4]=50;
        System.out.println(marks.length);
        //this is the second method to print an array and it is the easiest way to create an array
        int [] num={5,55,63,44,63,332,2};
        System.out.println(num.length);
        System.out.println("the fifth element of an array is "+num[5]);
        //below is the code to display an array
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
        //for each loop in java
        System.out.println("printing using for each loop in java");
        for(int element:num){
            System.out.println(element);
        }
    }
}
