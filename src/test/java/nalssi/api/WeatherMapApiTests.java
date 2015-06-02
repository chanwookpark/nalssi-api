package nalssi.api;

import org.junit.Test;

/**
 * Created by chanwook on 2015. 6. 2..
 */
public class WeatherMapApiTests {
    WeatherMapApi api = new WeatherMapApi();

    @Test
    public void getNalssiByCityNameForText() throws Exception {
        String response = api.getByCity("seoul", String.class);
        System.out.println("일단 조회해서 어떻게 떨이지는지 보자!\n" + response);

    }
}
