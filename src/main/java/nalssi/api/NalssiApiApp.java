package nalssi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chanwook
 */
@RestController
@EnableAutoConfiguration
@ComponentScan
public class NalssiApiApp extends SpringBootServletInitializer {
    @RequestMapping("/")
    String home() {
        return "Ready!";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(NalssiApiApp.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(NalssiApiApp.class, args);
    }
}
