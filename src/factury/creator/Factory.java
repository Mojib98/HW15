package factury.creator;

import factury.product.Account;
import factury.product.LongTermAccount;
import factury.product.ShortTermAccount;
import factury.product.StreamAccount;

public class Factory implements AccountFactory {


    @Override
    public Account buildAccount(String name, Integer amount) {
        switch (name) {
            case "short":
                return amount >= 50 ? new ShortTermAccount() : null;
            case "stream":
                return amount >= 100 ? new StreamAccount() : null;
            case "long":
                return amount >= 100 ? new LongTermAccount() : null;
        }
        return null;
    }
}
