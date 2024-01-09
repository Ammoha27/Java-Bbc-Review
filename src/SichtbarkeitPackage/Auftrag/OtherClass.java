package SichtbarkeitPackage.Auftrag;

public class OtherClass {

    private static String text = "hi";
    public static void setText(String text) {
        OtherClass.text = text;
    }

    public static void say(){
        System.out.println(text);
    }
}
