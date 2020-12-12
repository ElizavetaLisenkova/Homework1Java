import org.json.JSONException;
import org.json.JSONObject;

public class JsonParser {

    public static void chooseParsing(String response, String number) throws JSONException {
        if (number=="1") {
            OpenWeatherParsing(response);
        } else if (number=="2") {
            WeatherBitParsing(response);
        } else {
            WeatherStackParsing(response);
        }
    }

    private static String OpenWeatherParsing(String response) throws JSONException {
        JSONObject json = new JSONObject(response);
        String cityName = json.getString("name");
        Double currentTemp = json.getJSONObject("main").getDouble("temp");
        Double feelsLike = json.getJSONObject("main").getDouble("feels_like");
        Integer pressure = Math.toIntExact(Math.round(json.getJSONObject("main").getDouble("pressure") / 1.33));
        Double windSpeed = json.getJSONObject("wind").getDouble("speed");
        return printWeather(cityName, currentTemp.toString(), feelsLike.toString(), pressure.toString(), windSpeed.toString());
    }

    private static String WeatherBitParsing(String response) throws JSONException {
        JSONObject json = new JSONObject(response);
        String cityName = json.getJSONArray("data").getJSONObject(0).getString("city_name");
        Double currentTemp = json.getJSONArray("data").getJSONObject(0).getDouble("temp");
        Double feelsLike = json.getJSONArray("data").getJSONObject(0).getDouble("app_temp");
        Integer pressure = Math.toIntExact(Math.round(json.getJSONArray("data").getJSONObject(0).getDouble("pres") / 1.33));
        Double windSpeed = json.getJSONArray("data").getJSONObject(0).getDouble("wind_spd");
        return printWeather(cityName, currentTemp.toString(), feelsLike.toString(), pressure.toString(), windSpeed.toString());
    }

    private static String WeatherStackParsing(String response) throws JSONException {
        JSONObject json = new JSONObject(response);
        String cityName = json.getJSONObject("request").getString("query");
        Double currentTemp = json.getJSONObject("current").getDouble("temperature");
        Double feelsLike = json.getJSONObject("current").getDouble("feelslike");
        Integer pressure = Math.toIntExact(Math.round(json.getJSONObject("current").getDouble("pressure") / 1.33));
        Integer windSpeed = Math.toIntExact(Math.round(json.getJSONObject("current").getDouble("wind_speed")/7));
        return printWeather(cityName, currentTemp.toString(), feelsLike.toString(), pressure.toString(), windSpeed.toString());
    }

    public static String printWeather(String cityName, String currentTemp, String feelsLike, String pressure, String windSpeed ) {
        String weather = String.format("\n------------------------------\n\t" +
                "Погода на сегодня в городе %s: \n" +
                "------------------------------\n\t" +
                "Температура воздуха: %s°\n\t" +
                "Ощущается как %s° \n\t" +
                "Давление %s мм. рт. ст. \n\t" +
                "Cкорость ветра %s м/с.\n" +
                "------------------------------\n\n", cityName, currentTemp, feelsLike, pressure, windSpeed);
        System.out.printf(weather);
        return weather;
    }
}
