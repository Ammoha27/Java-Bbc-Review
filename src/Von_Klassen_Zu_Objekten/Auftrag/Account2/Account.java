package SichtbarkeitPackage.Auftrag.account;

public class Account {

    private static double balance = 0; // Saldo
    private static double intererstRate = 0.01; // Zinssatz
    public static final String currency = "CHF";


    // Zugriff auf Saldo und Zinssatz
    public static double getBalance() {
        return balance;
    }

    public static double getIntererstRate() {
        return intererstRate;
    }


    // Zinssatz neu setzen

    public static void setIntererstRate(double intererstRate) {
        Account.intererstRate = intererstRate;
    }


    // Zinsbetrag ausrechnen
    public static double getInterest(){
       return balance * intererstRate;
    }

    // Geld Einbezahlen ins Konto
    public static double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return balance;
        }
        else {
            throw new IllegalArgumentException("The amount has to be greater than 0 when depositing");
        }

    }

    // Geld Abheben vom Konto
    public static double withdraw(double amount) { // Abheben
        if (amount > 0 && amount <= balance) {
         balance -= amount;
         return balance;
        }
        else {
            throw new IllegalArgumentException("The amount has to be lower than the balance");
        }

    }

}
