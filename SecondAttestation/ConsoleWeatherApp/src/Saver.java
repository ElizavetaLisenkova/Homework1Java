import java.io.*;
import java.util.HashMap;

public class Saver {

    public static void writeToFile(String url, String number, String cityName) {
        HashMap<String, String> map = new HashMap<>();
        map.put("url", url);
        map.put("number", number);
        map.put("cityName", cityName);
        try{
            FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\eelis\\IdeaProjects\\att2\\HomeworkJava\\SecondAttestation\\ConsoleWeatherApp\\src\\saver.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Запись
            oos.writeObject(map);

            oos.close();
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

        public static HashMap<String, String> readFromFile() {
            try{
                FileInputStream fis = new FileInputStream(new File("C:\\Users\\eelis\\IdeaProjects\\att2\\HomeworkJava\\SecondAttestation\\ConsoleWeatherApp\\src\\saver.txt"));
                ObjectInputStream ois = new ObjectInputStream(fis);
                HashMap<String, String> map = (HashMap<String, String>) ois.readObject();
                fis.close();
                ois.close();
                return map;
            }catch(Exception ex){
                ex.printStackTrace();
            }
            return null;
        }

}

