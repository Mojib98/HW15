package part1ByAbstractFactory.Product;

public class LongTerAccount implements Account{
    private String name;
    private  Integer amount;

    public LongTerAccount(String name, Integer amount) {
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
    public Boolean isHaveMoney(Integer amount) {
        if (amount >500){
            return true;
        }else return false;
    }


}
