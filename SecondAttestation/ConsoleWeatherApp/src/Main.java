import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;




public class Main {

    final static String OpenWeatherApiKey = "eb2cb84a538b7ea88e6f6d6de029c054";
    final static String WeatherBitApiKey = "8681a1c1321a4eb9808e63f1a81f09f4";
    final static String weatherStackApiKey = "2347213b1b271af7aaa3e31eaf07ac9b";

    final static String Number1_Url = "http://api.openweathermap.org/data/2.5/weather?units=metric&appid=" + OpenWeatherApiKey + "&q=" ;
    final static String Number2_Url = "https://api.weatherbit.io/v2.0/current?NC&key=" + WeatherBitApiKey + "&city=";
    final static String Number3_Url = "http://api.weatherstack.com/current?access_key=" + weatherStackApiKey + "&query=";


    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        HashMap<String, String> weatherServices = new HashMap<String, String>();
        weatherServices.put("1", "Open Weather");
        weatherServices.put("2", "WeatherBit");
        weatherServices.put("3", "WeatherStack");

        Boolean exit = false;
        System.out.println("Добро пожаловать в консольное приложение.");
        while (!exit) {
            System.out.printf(
                    "\nВведите номер команды\n\t" +
                            "1: Использовать сервис %s \n\t" +
                            "2: Использовать сервис %s \n\t" +
                            "3: Использовать сервис %s \n\t" +
                            "4: Использовать сохраненные настройки \n\t" +
                            "0: Выход \n", weatherServices.get("1"), weatherServices.get("2"), weatherServices.get("3"));

            String number = in.nextLine();

            switch (number) {
                case "1":
                    System.out.println("Загрузка сервиса...");
                    getWeatherRequest(Number1_Url, "1");
                    System.out.println("Продолжение работы с приложением: ");
                    break;
                case "2":
                    System.out.println("Загрузка сервиса...");
                    getWeatherRequest(Number2_Url, "2");
                    System.out.println("Продолжение работы с приложением: ");
                    break;
                case "3":
                    System.out.println("Загрузка сервиса...");
                    getWeatherRequest(Number3_Url, "3");
                    System.out.println("Продолжение работы с приложением: ");
                    break;
                case "4":
                    System.out.println("Применяются сохраненные настройки...");
//                    getWeatherRequest();
                    System.out.println("Продолжение работы с приложением: ");
                case "0":
                    System.out.println("Выход из приложения...");
                    exit = true;
                    break;
                default:
                    System.out.println("Некорректный номер!");
            }

        }
    }


    public static void getWeatherRequest(String url, String number) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название города на русском или на английском языке");
        String cityName = in.nextLine();
        System.out.println("Загрузка данных...");
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(url + cityName).openConnection();
            connection.setRequestMethod("GET");
            StringBuilder sb = new StringBuilder();
            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
                BufferedReader response = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                while ((line = response.readLine()) != null){
                    sb.append(line);
                }
            } else {
                connection.getErrorStream();
            }

            JsonParser.chooseParsing(sb.toString(), number);

        } catch (Throwable cause) {
            cause.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

    }

}

