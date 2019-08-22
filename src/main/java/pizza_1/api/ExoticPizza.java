package pizza_1.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pizza_1.Interfaces.Ipizza;


@Component
public class ExoticPizza implements Ipizza
{
    private int price;
    private String name;

    public ExoticPizza(@Value("1") int price,@Value("Exotic") String name)
    {
        super();
        this.price=price;
        this.name=name;

    }

    public int getPrice()
    {
        return price;
    }



    public String getName()
    {
        return name;
    }

    public void setPrice(int price)
    {
        this.price=price;
    }
}
