

public class Main {
    public static void main(String[] args) {

        Account account = new SavingsAccount(3000);
        Account account1 = new CreditAccount(2000);
        Account account2 = new CheckingAccount(4000);


        account.transfer(account, account2.amount);

    }
}