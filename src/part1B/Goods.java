package part1B;

import java.util.ArrayList;
import java.util.List;

public class Goods {
    private String name;

    public Goods(String name) {
        this.name = name;
    }

    List<Customer> fallowing = new ArrayList<>();

    public void removeCustomer(Customer customer) {
        fallowing.remove(customer);
    }

    public void addCustomer(Customer customer) {
        fallowing.add(customer);
    }

    public void notofy(String not) {
        for (Customer customer : fallowing) {
            customer.update(customer.getName()+" "+this.name+" "+not);
        }
    }
}