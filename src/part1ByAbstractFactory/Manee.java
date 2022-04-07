package part1ByAbstractFactory;

import part1ByAbstractFactory.Creator.AccountCre;
import part1ByAbstractFactory.Creator.Long;
import part1ByAbstractFactory.Creator.Shorrt;
import part1ByAbstractFactory.Product.Account;

public class Manee {
    public static void main(String[] args) {
        AccountCre account = new Shorrt("majid",1000);
        account.account().creatAccount();


    }
}
