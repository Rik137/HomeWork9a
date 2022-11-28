

public class SavingsAccount extends Account{
    public String name = "savingsAccount";


    public SavingsAccount(int amount) {
        super(amount);


    }

    @Override
    public void addMoney(int amount) {
        super.addMoney(amount);
    }

    @Override
    public void transfer(Account account, int amount) {
        super.transfer(account, amount);
        System.out.println(name);

    }

    @Override
    public void pay(int amount) {
        System.out.println("платить с этого счета нельзя");
    }
}
