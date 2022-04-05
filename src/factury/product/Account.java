package factury.product;

import factury.creator.AccountFactory;

public interface Account {
    void creatAccount( String name);
    Boolean isHaveProfit();
    Boolean isHaveBachCheck();

}
