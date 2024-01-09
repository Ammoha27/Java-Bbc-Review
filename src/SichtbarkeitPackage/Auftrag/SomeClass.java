package SichtbarkeitPackage.Auftrag;

public class SomeClass {
    public static void main(String[] args) {

        // OtherClass.text = "Hallo";  Kann nicht direkt zugegriffen werden weil es private ist
        OtherClass.setText("Hallo");
        OtherClass.say(); //In SomeClass wird über den Klassennamen auf OtherClass zugegriffen
    }
}
