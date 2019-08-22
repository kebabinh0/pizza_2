package pizza_1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pizza_1.Interfaces.IOrder;
import pizza_1.Interfaces.Ipizza;
import pizza_1.api.ExoticPizza;
import pizza_1.api.GoodPizza;
import pizza_1.api.Order;

@Configuration
public class configuration
{
    @Bean(name = "dobra")
     public Ipizza pizza()
    {
        return new ExoticPizza(15,"Dobra");
    }
   /* @Bean(name = "order")
    public IOrder order(Ipizza pizza)
    {
        return new Order(pizza);
    }
    */

}
