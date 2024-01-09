package SichtbarkeitPackage.Auftrag.common;


public class StringExtensions {

    public static void main(String[] args) {
        String text = "Hallo Welt!";
        System.out.println("reversed: " + reverse(text));

        String zahl = "12345";
        System.out.println(quersum(zahl)); // Quersumme
    }

    static String reverse(String text){
        String reversedText = "";
        for (int i = 0; i < text.length() ; i++) {
            reversedText = text.charAt(i) + reversedText;
        }
        return reversedText;
    }

    static int quersum(String value) {
        int result = 0;
        char c = '0';
        for ( int i = 0; i < value.length(); i++ ) {
            c = value.charAt(i);
            if (!Character.isDigit(c)) throw new RuntimeException("Input contains non digit characters: " + value);
            result += Integer.parseInt(Character.toString(c));
        }
        return result;
    }
}


//Character.getNumericValue(value.charAt(i)) konvertiert das Zeichen an Position i in der Zeichenkette value in seine numerische Darstellung (0-9) und gibt diesen numerischen Wert zurück.


// !CHaracter.isDigit(c) wird überprüft, ob das Zeichen c keine Ziffer (0-9) ist, indem die Methode Character.isDigit(c) verwendet wird. Wenn c keine Ziffer ist, wird eine Ausnahme (Exception) vom Typ RuntimeException ausgelöst.
