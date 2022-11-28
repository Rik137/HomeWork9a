import java.util.Scanner;

public abstract class Account {
    protected int amount;
    protected Account account;

    public Account(int amount){
        this.amount = amount;

    }

    public void pay(int amount) {
        System.out.println("Баланс " + amount);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость покупки: ");
        int x = scanner.nextInt();
        if (amount > x) {
            System.out.println("Баланс" + (amount - x));

        }else {
            System.out.println("не достаточно средст");
        }
    }



    public void transfer(Account account, int amount){
        System.out.println("Баланс " + amount);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какую сумму нужно перевести: ");
        int x = scanner.nextInt();
        if(amount > x) {
            int y = account.amount + x;
            System.out.println("Баланс " + account.account + " " + y);
            System.out.println("остаток" + (amount - x));
        }

    }

    public void addMoney(int amount){
        System.out.println("Баланс " + amount);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите на какую сумму нужно увеличеть счет: ");
        int x = scanner.nextInt();
        System.out.println("Баланс" + (amount + x));

    }
}
