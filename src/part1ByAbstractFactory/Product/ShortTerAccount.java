package part1ByAbstractFactory.Product;

public class ShortTerAccount implements Account,profit{
    private String name;
    private  Integer amount;

    public ShortTerAccount(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void creatAccount() {
        if (isHaveMoney(this.amount)){
            System.out.println("your Account "+ this.name);
        }else System.out.println("cant made");
    }

    @Override
    public Boolean isHaveMoney(Integer amount) {
        if (amount >100){
            return true;
        }else return false;
    }

    @Override
    public boolean isHaveProfit() {
        return true;
    }
}
