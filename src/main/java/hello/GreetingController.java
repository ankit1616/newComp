package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    Greeting gr;

    private static final String shopName = "a";
    private static final String ownerName = "b";
    private static final String category = "c";
    private static final Double latitude = 1.2345;
    private static final Double longitude = 4.23456;


    @RequestMapping("/abc")
    public Greeting abc() {
        return new Greeting(shopName,ownerName,category,latitude,longitude);

        //return new Greeting(gr.getShopName(),gr.getOwnerName(),gr.getCategory(),gr.getLatitude(),gr.getLongitude());

    }
}

