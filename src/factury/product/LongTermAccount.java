package factury.product;

import factury.creator.AccountFactory;

public class LongTermAccount implements Account {
    String name;
    @Override
    public void creatAccount( String name) {
            System.out.println("you can have Account "+ name);
//
    }


    @Override
    public Boolean isHaveProfit() {
        return false;
    }

    @Override
    public Boolean isHaveBachCheck() {
        return false;
    }
}
