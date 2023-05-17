//these are some string methods used in java
public class stringmethods {
    public static void main(String[]args){
        String name="VimaLa";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(1));
        System.out.println(name.substring(4));
        System.out.println(name.substring(3));
        System.out.println(name.replace("V","kh"));
        System.out.println(name.startsWith("Vi"));
        System.out.println(name.startsWith("li"));
        System.out.println(name.endsWith("al"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.equals("VimaLa"));
        System.out.println(name.equalsIgnoreCase("vimalaa"));
    }
}
