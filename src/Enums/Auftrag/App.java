package Enums.Auftrag;

import Enums.Auftrag.Switch.Switch;
import Enums.Auftrag.Warmup.Aliens;
import Enums.Auftrag.Warmup.Gender;
import Enums.Auftrag.WorkingAliens.Alien;

public class App {
    public static void main(String[] args) {
        Aliens alien = new Aliens();
        Switch switch1 = new Switch();
        Alien alien1 = new Alien();
        alien.setGender(Gender.MALE);
        alien.printGender();
        switch1.Push();
        alien1.work();
    }
}
