import java.util.*;
public class cwhPracticeset {
    public static void main(String[] args) {
        //this is the first question and this is a question of cgpa
        float sub1 = 90;
        float sub2 = 85;
        float sub3 = 75;
        float sub4 = 88;
        float sub5 = 79;
        float cgpa = (sub1 + sub2 + sub3 + sub4 + sub5) / 50;
        System.out.println("the cgpa grade is=" + cgpa);
        //this is the second question aand it ask the name of the user
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name here:");
        String name = sc.nextLine();
        System.out.println("hello " + name + " have a good day");
        //this is the third question aand it convert kilometer to miles;
        Scanner s = new Scanner(System.in);
        System.out.print("enter the distance in kilometers");
        double dist = s.nextInt();
        double miles = dist * 0.62137119;
        System.out.println("the distance in miles is " + miles);
        //this is the fourth question to detect whether the number entered by a user is integer or not
        Scanner as = new Scanner(System.in);
        System.out.print("enter the number:");
        float num = as.nextInt();
        if (num >= 0) {
            System.out.println("it is an integer");
        } else {
            System.out.println("it is not an integer");


        }
    }
}
