package nalssi.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chanwook
 */
@RestController
public class NalssiApiController {

    WeatherMapApi api = new WeatherMapApi();

    @RequestMapping("/w/city/{cityName}")
    public String getCurrentWeather(@PathVariable String cityName) {
        return api.getByCity(cityName, String.class);
    }
}
