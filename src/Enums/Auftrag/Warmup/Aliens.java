package Enums.Auftrag.Warmup;

public class Aliens {
    private Gender gender = Gender.OTHER; // Default value   privaten Variable innerhalb einer Klasse, die den Typ des benutzerdefinierten Enum Gender hat und mit dem Wert OTHER aus diesem Enum initialisiert wird.


    public void printGender() {
        switch (gender){
            case MALE -> System.out.println("My Gender is Male");
            case FEMALE -> System.out.println("My Gender is Female");
            case OTHER -> System.out.println("My Gender is Other");
        }
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}
