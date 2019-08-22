package pizza_1.api;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pizza_1.Interfaces.IOrder;
import pizza_1.configuration.autoCofnig;

public class App 
{
    public static void main( String[] args )

    {

        ApplicationContext context = new AnnotationConfigApplicationContext(autoCofnig.class);
        IOrder order = context.getBean(IOrder.class);
        order.printOrder();





    }

}
