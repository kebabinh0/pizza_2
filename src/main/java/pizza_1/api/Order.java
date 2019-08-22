package pizza_1.api;

import org.springframework.stereotype.Component;
import pizza_1.Interfaces.Ipizza;
import pizza_1.Interfaces.IOrder;

@Component
public class Order implements IOrder {
    private Ipizza pizza;

    public Order (Ipizza pizza)
    {
        super();

        this.pizza=pizza;
    }

    public void printOrder()
    {
        System.out.println("Zamówienie : " + pizza.getName() + " cena : " + pizza.getPrice() );
    }
}

