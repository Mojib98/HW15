package factury;

import factury.creator.AccountFactory;
import factury.creator.Factory;
import factury.product.Account;

public class main1 {
    public static void main(String[] args) {
     /*   AccountFactory ss= new LongTermAccountFactory();
        ss.account().creatAccount(200,"majid");
        Account account = new StreamAccount();*/
        AccountFactory accountFactory = new Factory();
        Account account = accountFactory.buildAccount("short",100);
        account.creatAccount( "majid");

    }
}
