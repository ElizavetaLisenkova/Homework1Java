import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String OpenWeatherApiKey = "eb2cb84a538b7ea88e6f6d6de029c054";
        String AccuWeatherApiKey = "CgTufWidZEe9A1aI3cA27SbCZnPlQd4d";
        String weatherStackApiKey = "2347213b1b271af7aaa3e31eaf07ac9b";

        String OpenWeatherUrl = "api.openweathermap.org/data/2.5/weather?&appid=eb2cb84a538b7ea88e6f6d6de029c054&units=metric&q=";
        String AccuWeatherUrl = "";
        String weatherStackUrl = "http://api.weatherstack.com/current?access_key=2347213b1b271af7aaa3e31eaf07ac9b&query=";

        Scanner in = new Scanner(System.in);

        HashMap<Integer, String> weatherServices = new HashMap<Integer, String>();
        weatherServices.put(1, "Open Weather");
        weatherServices.put(2, "AccuWeather");
        weatherServices.put(3, "WeatherStack");

        System.out.printf("Добро пожаловать в консольное приложение. \n Чтобы узнать погоду, введите интересующий вас город: ");
        String cityName = in.nextLine();

        System.out.printf("Введите номер погодного сервиса: 1, 2 или 3.\n\t 1: Open Weather \n\t 2: AccuWeather \n\t 3: WeatherStack \n");
        int weatherServiceId = in.nextInt();

        System.out.printf("Погода в городе %s, ссылаясь на %s", cityName, weatherServices.get(weatherServiceId));
    }
}
