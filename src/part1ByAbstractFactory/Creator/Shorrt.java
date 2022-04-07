package part1ByAbstractFactory.Creator;

import part1ByAbstractFactory.Product.Account;
import part1ByAbstractFactory.Product.StreamAccount;

public class Shorrt implements AccountCre{
    private String name;
    private  Integer amount;

    public Shorrt(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }


    @Override
    public Account account() {
        return new StreamAccount(name,amount);
    }
/*
    @Override
    public profit profit() {
        return null;
    }*/
}
