package ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gaurav.raval on 23/06/17.
 */


@SpringBootApplication
public class MyGroceryWsConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(MyGroceryWsConfiguration.class, args);
    }
}
