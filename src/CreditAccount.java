public class CreditAccount extends Account{
    public Account creditAccount;

    public CreditAccount(int amount){
        super(amount);

    }

    @Override
    public void transfer(Account account, int amount) {
        super.transfer(account, amount);
        this.account = creditAccount;
        System.out.println(creditAccount);
    }

    @Override
    public void pay(int amount) {
        super.pay(amount);
    }

    @Override
    public void addMoney(int amount) {
        super.addMoney(amount);
    }
}
