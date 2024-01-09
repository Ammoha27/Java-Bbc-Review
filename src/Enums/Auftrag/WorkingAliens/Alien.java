package Enums.Auftrag.WorkingAliens;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Alien {
    //Aliens don’t work on Fridays
    private static final DayOfWeek freeDay = DayOfWeek.FRIDAY;

    public void work() {
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        switch (today){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("this Alien is working");
            case FRIDAY -> System.out.println("this Alien is not working on Friday");
        }
    }

}
