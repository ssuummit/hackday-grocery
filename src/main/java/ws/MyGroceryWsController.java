package ws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by gaurav.raval on 23/06/17.
 */

    import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

    @Controller
    @RequestMapping("/temp/getBill/{id}")
    public class MyGroceryWsController {

        private static final String template = "Hello, %s!";
        private final AtomicLong counter = new AtomicLong();

        @RequestMapping(method= RequestMethod.GET)
        public @ResponseBody
        Billing sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
            return new Billing(counter.incrementAndGet(), String.format(template, name));
        }

    }

