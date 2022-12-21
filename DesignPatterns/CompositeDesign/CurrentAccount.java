package DesignPatterns.CompositeDesign;

public class CurrentAccount extends Account{
    private final int currentAmount;

    public CurrentAccount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    @Override
    public int getBalance() {
        return currentAmount;
    }
}
