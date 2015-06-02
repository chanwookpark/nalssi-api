package nalssi.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @Author chanwook
 */
public class WeatherMapApi {
    RestTemplate template = new RestTemplate();

    public <T> T getByCity(String cityName, Class<T> responseType) {
        ResponseEntity<T> response =
                template.getForEntity("http://api.openweathermap.org/data/2.5/weather?q=" + cityName,
                        responseType);
        return response.getBody();
    }
}
