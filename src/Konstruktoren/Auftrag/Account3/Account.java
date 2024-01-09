package Konstruktoren.Auftrag.Account3;

public class Account {

    private  double balance = 0;
    private double intererstRate = 0.01;
    public static final String currency = "CHF";

    private Person owner;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public  double getBalance() {
        return balance;
    }

    public  double getIntererstRate() {
        return intererstRate;
    }



    public void setIntererstRate(double intererstRate) {
        this.intererstRate = intererstRate;
    }

    public  double getInterest(){
       return balance * intererstRate;
    }


    public Account(Person owner){
        this.owner = owner;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return balance;
        }
        else {
            throw new IllegalArgumentException("The amount has to be greater than 0 when depositing");
        }

    }


    public double withdraw(double amount) { // Abheben
        if (amount > 0 && amount <= balance) {
         balance -= amount;
         return balance;
        }
        else {
            throw new IllegalArgumentException("The amount has to be lower than the balance");
        }

    }

    public static Account[] createAccountsForPeople(Person[] people) {
        Account[] accounts = new Account[people.length]; // Account[] accounts; Variable namens accounts, die ein Array von Account-Objekten ist. / new Account[..]; initialisiert das Array.
        for (int i = 0; i < people.length; i++) {
            accounts[i] = new Account(people[i]);
    }
        return accounts;
    }



    public static Account findAccountWithBiggetsBalance(Account[] account){
        Account biggetsBalance = account[1];
        for (int i = 1; i < account.length; i++){
            if (account[i].getBalance() > biggetsBalance.getBalance()){
                biggetsBalance = account[i];
            }
        }
        return biggetsBalance;
    }

}


// 1 Wir erstellen eine Person Klasse
// statt das wir ein Konstruktor in der acc klasse mit all den daten machen, erstellen wir eine Person Klasse und ein Konstruktor das die Daten hat
// da in oop zusammengehörende Elemente in ein Objekt gepackt werden sollen



// 2 wir erstellen einen Konstruktor in Account
// der Konstruktor nimmt eine Person als Parameter entgegen

// Jetzt ist es nicht mehr möglich mit new Account() ein neues Konto-Objekt zu erstellen, da wir gezwungen sind eine Person mitzugeben.
// die Account instanz erwartet ein Person Objekt als Parameter und nicht zwei seperate String Werte.


// 3 Daher müssen wir jetzt die createAccounts methode anpassen
// Anstelle übergeben wir der Methode nicht mehr die Anzahl der zu erstellenden Konten, sondern wir übergeben ein Array von Person-Objekten:

// 4 Die App Klasse muss auch angepasst werden
// ein Person Array das die Instanzen der Klasse bekommt muss erstellt werden und dann der createAccountsklasse auch übergeben werden

// 5 Die createAccounts Methode muss jetzt den array nehmen und für jeden Account eine Person mitgeben,