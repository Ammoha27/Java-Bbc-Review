package Konstruktoren.Auftrag.Account3;


import static Konstruktoren.Auftrag.Account3.Account.createAccountsForPeople;

public class App {
    public static void main(String[] args) {

        Person[] person = new Person[10];
        for (int i = 0; i < person.length; i++){
            person[i] = new Person("Amir", "Mohamed");

        }

        Account[] accounts = createAccountsForPeople(person);

        for (int i = 0; i < 10; i++) {
            accounts[i].deposit(RandomHelper.getRandomDouble(1, 1000));
        }

        Account accountWithBiggetsBalance = Account.findAccountWithBiggetsBalance(accounts);
        System.out.println(accountWithBiggetsBalance.getOwner() + " has the biggets balance with " + accountWithBiggetsBalance.getBalance() + " CHF ");

        for (int i = 0; i < accounts.length; i++){
            System.out.println(accounts[i].getOwner());
        }

        System.out.println("----------------------------------------------");


        for (int i = 0; i < person.length; i++){
            person[i].setFirstname("Nicht Amir");

        }
        for (int i = 0; i < accounts.length; i++){
            System.out.println(accounts[i].getOwner());
        }

        System.out.println("----------------------------------------------");

        for (int i = 0; i < person.length; i++){
            person[i] = new Person("Christof", "Flück");
        }

        for (int i = 0; i < person.length; i++){
            person[i] = new Person("lol", "sds");
            accounts[i].setOwner(person[i]);
        }

        for (int i = 0; i < accounts.length; i++){
        System.out.println(accounts[i].getOwner());
    }



}


}


