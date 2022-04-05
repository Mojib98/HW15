package part1B;

import java.util.ArrayList;
import java.util.List;

public class Customer {
   private String name;
   private List<Goods> favouriteGoods = new ArrayList<>();
   public void addGoods(Goods goods){
       favouriteGoods.add(goods);
   }
   public void update(String goods){
       System.out.println(goods);
   }

    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }
}

