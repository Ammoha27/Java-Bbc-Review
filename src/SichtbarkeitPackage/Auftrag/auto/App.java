package SichtbarkeitPackage.Auftrag.auto;

public class App {
    public static void main(String[] args) {

        Car.setFahrerName("Max Mustermann");

        // Starte das Auto
        Car.starten();

        // Überprüfe den Status des Autos und den Fahrernamen
        System.out.println("Das Auto ist in Bewegung: " + Car.isInBewegung());
        System.out.println("Fahrername: " + Car.getFahrerName());

        // Halt das Auto an
        Car.anhalten();

        // Überprüfe den Status des Autos nach dem Anhalten
        System.out.println("Das Auto ist in Bewegung: " + Car.isInBewegung());

    }
}
