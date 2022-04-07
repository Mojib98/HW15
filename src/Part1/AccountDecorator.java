package Part1;

public abstract class AccountDecorator implements Account {
   private Account account;
    Integer amount;
    String name;

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*    public AccountDecorator(Integer amount, String name) {
        this.amount = amount;
        this.name = name;
    }*/

    public AccountDecorator(Account account) {
        this.account = account;
    }

    @Override
    public void create() {
     this.account.create();
    }
    @Override
    public abstract boolean canCreateAccount(Integer amount);


 abstract void feature();
}
