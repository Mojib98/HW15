package part1A;

public class Account {
    private String name;
    private Integer nationalId;
    private boolean batchCheck;
    private boolean profit;
    private TypeAccount typeAccount;
    private Integer amount;
    private Account(Account.builder builder){
        this.name = builder.name;
        this.nationalId=builder.nationalId;
        this.batchCheck=builder.batchCheck;
        this.profit=builder.profit;
        this.typeAccount=builder.typeAccount;
        this.amount=builder.amount;
    }
    public static class builder{
        private String name;
        private Integer nationalId;
        private boolean batchCheck=false;
        private boolean profit=false;
        private TypeAccount typeAccount;
        private Integer amount;


        public builder(String name, Integer nationalId) {
            this.name = name;
            this.nationalId = nationalId;
        }
        public builder type(TypeAccount typeAccount){
            if (typeAccount.equals(TypeAccount.SHORTTERM)){
                profit();
            }else if (typeAccount.equals(TypeAccount.SRTEAM)){
                batch();
            }
            this.typeAccount=typeAccount;
            return this;
        }
        private builder profit(){
           this.profit = true;
           return this;
        }
        private builder batch(){
            this.batchCheck=true;
            return this;
        }
        public builder amoumt(Integer amount){
            this.amount=amount;
            return this;
        }
        public Account build(){
            if (checker())
            return new Account(this);
            return null;
        }
        private boolean checker(){
            if (this.typeAccount.equals(TypeAccount.SRTEAM) & this.amount>=100){
                return true;
            }else if (this.typeAccount.equals(TypeAccount.LONGTERM) & this.amount>=100){
                return true;
            }else if (typeAccount.equals(TypeAccount.SHORTTERM) & this.amount>=50){
                return true;
            }
            return false;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", nationalId=" + nationalId +
                ", batchCheck=" + batchCheck +
                ", profit=" + profit +
                ", typeAccount=" + typeAccount +
                ", amount=" + amount +
                '}';
    }
}
