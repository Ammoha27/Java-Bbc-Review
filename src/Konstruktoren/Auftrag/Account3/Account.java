package Von_Klassen_Zu_Objekten.Auftrag.Account2;

public class Account {

    private  double balance = 0; // Saldo
    private double intererstRate = 0.01; // Zinssatz
    public static final String currency = "CHF";


    // Zugriff auf Saldo und Zinssatz
    public  double getBalance() {
        return balance;
    }

    public  double getIntererstRate() {
        return intererstRate;
    }


    // Zinssatz neu setzen

    public void setIntererstRate(double intererstRate) {
        this.intererstRate = intererstRate;
    }


    // Zinsbetrag ausrechnen
    public  double getInterest(){
       return balance * intererstRate;
    }

    // Geld Einbezahlen ins Konto
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return balance;
        }
        else {
            throw new IllegalArgumentException("The amount has to be greater than 0 when depositing");
        }

    }

    // Geld Abheben vom Konto
    public double withdraw(double amount) { // Abheben
        if (amount > 0 && amount <= balance) {
         balance -= amount;
         return balance;
        }
        else {
            throw new IllegalArgumentException("The amount has to be lower than the balance");
        }

    }

    public static Account[] createAccounts(int numberOfAccountsToCreate) { // Account[] = wir returnen ein Array von Account Instanzen
        Account[] accounts = new Account[numberOfAccountsToCreate];
        for (int i = 0; i < numberOfAccountsToCreate; i++) {
            accounts[i] = new Account();
        }
        return accounts;
        // Wir erstellen ein Array mit Instanzen der Account Klasse
    }


}
