package part1ByAbstractFactory.Creator;

import part1ByAbstractFactory.Product.Account;
import part1ByAbstractFactory.Product.LongTerAccount;

public class Long implements AccountCre{
    private String name;
    private  Integer amount;

    public Long(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public Account account() {
        return new LongTerAccount(name,amount);
    }

}
