package Part1;

public class ShortTermAccount extends AccountDecorator{


    public ShortTermAccount(Account account) {
        super(account);
    }

    @Override
    void feature() {
        System.out.println("you have NoteBook :/");
    }
    @Override
    public void create() {
        super.create();
        System.out.println("you have stream Account");
    }

    @Override
    public boolean canCreateAccount(Integer amount) {
        return false;
    }
}
