package Riddle;

public class App
{

    public static void main(String[] args)
    {
        Mascot mascot = new Mascot("A");
         foo(mascot);

          System.out.println(mascot.getName());
    }

    private static void foo(Mascot mascot) {
        mascot.setName("B");
        mascot = new Mascot ("C");
    }

}



/* Meine Schätzung

Die Ausgabe ist B, weil der Funktionsaufruf nach der Inialisierung
erfolgt, somit wird der name auf B gesetzt

 */