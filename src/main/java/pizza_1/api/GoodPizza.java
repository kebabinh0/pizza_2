package pizza_1.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pizza_1.Interfaces.Ipizza;

@Component
@Primary
@PropertySource("classpath:ceny.properties")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GoodPizza implements Ipizza
{


    private int price;
    private String name;


    public GoodPizza(@Value("${cena_dobrej}") int price, @Value("${nazwa}") String name)
    {
        super();
        this.price=price;
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price=price;
    }

}

