package Von_Klassen_Zu_Objekten.Auftrag.Account2;

public class App {
    public static void main(String[] args) {


        Account[] accounts = Account.createAccounts(10);
        for (int i = 0; i < accounts.length; i++){
            accounts[i].deposit(RandomHelper.getRandomDouble(1, 1000));
        }


        Account AccoutnwithBiggetsSaldo = accounts[1];
        for (int i = 1; i < accounts.length; i++){
            if (accounts[i].getBalance() > AccoutnwithBiggetsSaldo.getBalance()){
                AccoutnwithBiggetsSaldo = accounts[i];
            }
        }
        System.out.println(AccoutnwithBiggetsSaldo.getBalance());
            }
        }

/*
        Account AccoutnwithBiggetsSaldo = null;
        for (int i = 1; i < accounts.length; i++){
            if (accounts[i].getBalance() > AccoutnwithBigggetsSaldo.getBalance()){
                AccoutnwithBigetsSaldo = accounts[i];
                    }
                }

              Das würde ein NullPointerExeption auslösen, weil wir eine Methode auf eine Instanz ausführen die null ist
              Lösung = Wir geben die erste Instanz vom accounts der Varaible AcoountwithBiggetsSaldo, somit wöre AcoountwithBiggetsSaldo die erste Instanz vom Array
              Und so könnten wir die balance von jeder Instanz im Array mit der Instanz AccountwithBiggetsSaldo vergleichen
              und die Instanz der Variable AccountwithBiggetsSaldo mit der neuen Instanz ersetzen.

 */