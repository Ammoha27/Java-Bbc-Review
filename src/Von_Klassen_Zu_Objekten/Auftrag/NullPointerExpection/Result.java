package Von_Klassen_Zu_Objekten.Auftrag.NullPointerExpection;

public class Result {

    private boolean isRight;

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public void printRight(){
        System.out.println(isRight);
    }

    public static Result isNumberBiggerThanZero(int number){
           Result result = null; // result verweist auf keine Klasse sondern ist null.

        if (number > 0) {
            result = new Result();
            result.setRight(true);
        } else if (number < 0){
            result = new Result();
            result.setRight(false);
        }
        else {
            result = new Result();
        }
        return result;
    }
}

/*

Die NullPointerException wird ausgelöst, weil versucht wird,
auf eine Methode (isRight()) eines Objekts (result) zuzugreifen, das null ist.
Dies geschieht, wenn numberToCheck den Wert 0 hat,
da in diesem Fall die Bedingungen innerhalb der isNumberBiggerThanZero-Methode nicht erfüllt sind und result nicht initialisiert wird,
sondern null bleibt.

Lösung: Result initialisieen


Eine NullPointerException in Java ist eine Laufzeit-Ausnahme, die auftritt,
wenn Ihr Programm versucht, eine Operation auf einem Objektreferenz auszuführen, die null ist. Da null bedeutet,
dass die Referenz auf kein tatsächliches Objekt im Speicher zeigt,
kann das Programm keine Methoden aufrufen oder auf Variablen dieses nicht existierenden Objekts zugreifen.



 */