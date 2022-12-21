package DesignPatterns.CompositeDesign;

import DesignPatterns.FacadeDesign.Light;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount extends Account{
    List<Account> list = new ArrayList<>();
    @Override
    public int getBalance() {
        int amount = 0;
        for(Account l : list)
        {
            amount += l.getBalance();
        }
        return amount;
    }

    public void addAccount(Account account)
    {
        list.add(account);
    }

    public void removeAccount(Account account)
    {
        list.remove(account);
    }
}
