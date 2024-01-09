package Von_Klassen_Zu_Objekten.Auftrag.NullPointerExpection;



import static Von_Klassen_Zu_Objekten.Auftrag.NullPointerExpection.Result.isNumberBiggerThanZero;

public class NullPointerExpection {
    public static void main(String[] args) {

        int numberToCheck = 0;
        Result result = isNumberBiggerThanZero(numberToCheck);
        result.printRight();
        if (result.isRight()){
            System.out.println("The number was bigger than zero");
        }
        else {
            System.out.println("The number was not bigger than zero");
        }
    }
}
