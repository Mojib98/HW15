package part1B;

public class Store {
    public static void main(String[] args) {


        Customer customer1 = new Customer("Ahmad");
        Customer customer2 = new Customer("Ahmad2");
        Customer customer3 = new Customer("Ahmad3");
        Goods pen = new Goods("pen");
        pen.addCustomer(customer1);
        pen.addCustomer(customer2);
        pen.addCustomer(customer3);
        pen.notofy("is havd");

    }
}