package Part1;

public class Main {
    public static void main(String[] args) {
        Account account = new LongTermAccount(new StTermAccount(100,"majid"));
        account.create();

    }
}
