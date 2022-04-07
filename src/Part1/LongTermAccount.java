package Part1;

public class LongTermAccount extends AccountDecorator{
    public LongTermAccount(Account account) {
        super(account);
    }

    @Override
    public void create() {
        super.create();
        if (canCreateAccount(amount)) {
            System.out.println("you have Long");
        } else System.out.println("cant");
    }

    @Override
    public boolean canCreateAccount(Integer amount) {
       //super.canCreateAccount(amount);
        if (amount>100){
            return true;
        }else return false;
    }

    @Override
    void feature() {
        System.out.println("you have *****");
    }
}
