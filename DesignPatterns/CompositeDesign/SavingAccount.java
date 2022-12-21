package DesignPatterns.CompositeDesign;

public class SavingAccount extends Account{
    private final int savingAmount;

    public SavingAccount(int savingAmount) {
        this.savingAmount = savingAmount;
    }

    @Override
    public int getBalance() {
        return savingAmount;
    }
}
