package nalssi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chanwook
 */
@RestController
@EnableAutoConfiguration
public class NalssiApp {
    @RequestMapping("/")
    String home() {
        return "OK!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(NalssiApp.class, args);
    }
}
