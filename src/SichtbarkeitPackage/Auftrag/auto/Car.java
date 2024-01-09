package SichtbarkeitPackage.Auftrag.auto;

public class Car {
    private static String fahrerName;
    private static boolean isInBewegung;

    public static String getFahrerName() {
        return fahrerName;
    }

    public static void setFahrerName(String fahrerName) {
        Car.fahrerName = fahrerName;
    }

    public static boolean isInBewegung() {
        return isInBewegung;
    }

    public static void setInBewegung(boolean inBewegung) {
        isInBewegung = inBewegung;
    }


    public static void starten(){
        if (fahrerName != null && !isInBewegung){
            isInBewegung = true;
            System.out.println("Das Auto ist jetzt in Bewegung");
        }
        else if (fahrerName == null){
            System.out.println("kein Fahrer zugewiesen");
        }

        else {
            System.out.println("Das Auto ist bereits in Bewegung.");
        }
    }


    public static void anhalten() {
        if (isInBewegung) {
            isInBewegung = false;
            System.out.println("Das Auto wurde angehalten");
        }
        else {
            System.out.println("Das Auto ist nicht am fahen");
        }
    }
}
