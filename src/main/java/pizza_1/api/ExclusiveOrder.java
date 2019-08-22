package pizza_1.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pizza_1.Interfaces.IOrder;
import pizza_1.Interfaces.Ipizza;

@Component
@Primary
public class ExclusiveOrder implements IOrder
{

    private Ipizza pizza;


    public ExclusiveOrder()
    {
        super();
    }


    public void printOrder()
    {
        System.out.println("Zamowienie exclusive: " + pizza.getName() + ". Cena: " + pizza.getPrice());
    }

    public Ipizza getPizza()
    {
        return pizza;
    }

    @Autowired
    public void setPizza(Ipizza pizza)
    {
        pizza.setPrice(20);
        this.pizza=pizza;
    }
}
