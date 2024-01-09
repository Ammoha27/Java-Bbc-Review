package Klassen.Auftrag;

public class StringExtensions {
    public static void main(String[] args) {
        String text = "Hallo Welt!";
        System.out.println("reversed: " + reverse(text));

        String zahl = "1234520";
        System.out.println(quersum(zahl)); // Quersumme
    }



    static String reverse(String text){
        String result = "";
        for (int i = text.length() -1; i >= 0; i--){
            result+=text.charAt(i);
        }
        return result;
    }

    static int quersum(String value) {
        int quersum = 0;
        for (int i = 0; i < value.length(); i++){
            quersum += Character.getNumericValue(value.charAt(i));
        }
        return quersum;
    }
}


//Character.getNumericValue(value.charAt(i)) konvertiert das Zeichen an Position i in der Zeichenkette value in seine numerische Darstellung (0-9) und gibt diesen numerischen Wert zurück.
