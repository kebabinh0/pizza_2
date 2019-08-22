package pizza_1.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@ComponentScan("pizza_1.api")
@Import(configuration.class)
public class autoCofnig
{
}
