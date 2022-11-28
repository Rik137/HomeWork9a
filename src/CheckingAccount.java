public class CheckingAccount extends Account{

    public Account checkingAccount;
    public CheckingAccount(int amount){
        super(amount);
    }

    @Override
    public void pay(int amount) {
        super.pay(amount);
    }

    @Override
    public void addMoney(int amount) {
        super.addMoney(amount);
    }

    @Override
    public void transfer(Account account, int amount) {
        super.transfer(account, amount);
        this.account = checkingAccount;
        System.out.println(checkingAccount);
    }
}
