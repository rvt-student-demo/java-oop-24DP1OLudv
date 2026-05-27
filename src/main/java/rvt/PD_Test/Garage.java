package rvt.PD_Test;
import java.util.ArrayList;

public class Garage {
    ArrayList<Car> cars = new ArrayList<>();

    public void addcar(Car car) {
        cars.add(car);
    }
    public void removecar(Car car) {
        cars.remove(car);
    }

    public void showcars(){
        for(Car car : cars) {
            car.printCar();
        }
    }
}
