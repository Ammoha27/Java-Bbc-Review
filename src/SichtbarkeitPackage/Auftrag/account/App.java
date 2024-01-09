package SichtbarkeitPackage.Auftrag.account;

public class App {
    public static void main(String[] args) {

        //Geld einzahlen
        double balance = Account.deposit(100);
        System.out.println("Saldo nach Einzahlung " + balance);

        balance = Account.withdraw(30);
        System.out.println("Saldo nach Abhebung " + balance);

        Account.setIntererstRate(0.001);
        System.out.println("Zinstatz " + Account.getIntererstRate());

        System.out.println("Aktueller Saldo " + balance);

        double Interest = Account.getInterest();
        System.out.println("Zinsen " + Interest);

    }
}


