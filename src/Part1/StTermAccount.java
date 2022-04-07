package Part1;

public class StTermAccount implements Account {
    Integer amount;
    String name;

    public StTermAccount(Integer amount, String name) {
        this.amount = amount;
        this.name = name;
    }



    @Override
    public void create() {
        if (canCreateAccount(this.amount)){
            System.out.println("you can");
        }else System.out.println("you cant");

    }

    @Override
    public boolean canCreateAccount(Integer amount) {
        if (amount>50)
        return true;
        else return false;
    }
}
