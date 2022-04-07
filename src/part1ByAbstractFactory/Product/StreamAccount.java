package part1ByAbstractFactory.Product;

public class StreamAccount implements Account,BatchOfCheck{
    private String name;
    private  Integer amount;

    public StreamAccount(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void creatAccount() {
        if (isHaveMoney(amount)){
            System.out.println("your Account "+ name);
        }else System.out.println("cant made");

    }

    @Override
    public Boolean isHaveMoney( Integer amount) {
        if (amount >100){
            return true;
        }else return false;
    }

    @Override
    public boolean isHaveCheck() {
        return true;
    }
}
