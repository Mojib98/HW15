package factury.product;

import factury.creator.AccountFactory;

public class StreamAccount implements Account {
    @Override
    public void creatAccount(String name) {
            System.out.println("you can have Account "+name);
//            return this;

    }




    @Override
    public Boolean isHaveProfit() {
        return false;
    }

    @Override
    public Boolean isHaveBachCheck() {
        return true;
    }
}
