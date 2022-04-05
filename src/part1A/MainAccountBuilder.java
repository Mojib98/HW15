package part1A;

public class MainAccountBuilder {
    public static void main(String[] args) {
        Account account =new  Account.builder("majid",1212).type(TypeAccount.SRTEAM).amoumt(1).build();
        System.out.println(account);
    }
}
