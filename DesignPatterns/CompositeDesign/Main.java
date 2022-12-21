package DesignPatterns.CompositeDesign;

public class Main {
    public static void main(String[] args)
    {
        CompositeAccount compositeAccount = new CompositeAccount();
        compositeAccount.addAccount(new CurrentAccount(100));
        compositeAccount.addAccount(new SavingAccount(500));

        int ans = compositeAccount.getBalance();

        System.out.println(ans);
    }
}
