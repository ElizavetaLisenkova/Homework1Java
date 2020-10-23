package Kr;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private int volume;
    private int MaxToyota = 4;
    private int currentCountToyota = 0;
    private Map<String, Integer> cars= new HashMap<String, Integer>();

    public Garage(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void add(Car car) {
        if (this.volume > 0) {
            this.volume -= 1;
            System.out.println("Добавлено в гараж. Места осталось:" + this.volume);
            if (car instanceof Toyota && currentCountToyota <= MaxToyota) {
                currentCountToyota += 1;
                System.out.println("Можно еще поставить " + (MaxToyota - this.currentCountToyota) + " Toyota.");

            }
        }
    }

    public void outputCars() {
        System.out.println("В гараже содержится " + this.currentCountToyota);
    }

}
