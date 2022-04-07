package factury.creator;

import factury.product.Account;

public interface AccountFactory {
    default Account buildAccount(String name,Integer amount){
            return null;
    }
}
