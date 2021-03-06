import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        Country country1 = new Country("Poland", 'P');
        Country country2 = new Country("Albania", 'A');
        Country country3 = new Country("Korea", 'K');
        Country country4 = new Country("China", 'C');
        Country country5 = new Country("Spain", 'S');

        Market market1 = new Market("Business", country1, country2, country3);
        Market market2 = new Market("Taxi", country4, country2, country3);
        Market market3 = new Market("Cargo", country1, country5, country3);
        Market market4 = new Market("Bus", country4, country2, country5);
        Market market5 = new Market("Transport", country5, country1, country3);

        Dimension dimension1 = new Dimension(1230, 2580, 420);
        Dimension dimension2 = new Dimension(750, 3255, 450);
        Dimension dimension3 = new Dimension(6321, 3620, 50);
        Dimension dimension4 = new Dimension(6523, 2514, 47);
        Dimension dimension5 = new Dimension(920, 2555, 101);
        Dimension dimension6 = new Dimension(620, 2354, 89);
        Dimension dimension7 = new Dimension(9850, 2376, 160);
        Dimension dimension8 = new Dimension(7880, 4265, 299);
        Dimension dimension9 = new Dimension(13642, 78620, 262);
        Dimension dimension10 = new Dimension(1785, 1864, 506);

        ArrayList<Dimension> dimensions1 = new ArrayList<>();
        dimensions1.add(dimension1);
        dimensions1.add(dimension3);
        ArrayList<Dimension> dimensions2 = new ArrayList<>();
        dimensions2.add(dimension2);
        dimensions2.add(dimension3);
        ArrayList<Dimension> dimensions3 = new ArrayList<>();
        dimensions3.add(dimension4);
        dimensions3.add(dimension5);
        ArrayList<Dimension> dimensions4 = new ArrayList<>();
        dimensions4.add(dimension6);
        dimensions4.add(dimension7);
        ArrayList<Dimension> dimensions5 = new ArrayList<>();
        dimensions5.add(dimension8);
        dimensions5.add(dimension9);
        ArrayList<Dimension> dimensions6 = new ArrayList<>();
        dimensions6.add(dimension10);
        dimensions6.add(dimension1);
        dimensions6.add(dimension3);


        Producent producent1 = new Producent("BMW", "X5");
        Producent producent2 = new Producent("BMW", "X3");
        Producent producent3 = new Producent("BMW", "X4");
        Producent producent4 = new Producent("BMW", "Q4");
        Producent producent5 = new Producent("VOLVO", "100");
        Producent producent6 = new Producent("FW", "XXX");
        Producent producent7 = new Producent("AUDI", "100");
        Producent producent8 = new Producent("TOYOTA", "COROLLA");
        Producent producent9 = new Producent("TOYOTA", "RAV4");
        Producent producent10 = new Producent("MINI", "COUNTRYMAN");

        Car car1 = new Car(producent1, true, market5, "premium", dimensions1);
        Car car2 = new Car(producent2, false, market2, "medium", dimensions2);
        Car car3 = new Car(producent3, false, market5, "medium", dimensions3);
        Car car4 = new Car(producent4, false, market4, "standard", dimensions4);
        Car car5 = new Car(producent5, false, market5, "standard", dimensions5);
        Car car6 = new Car(producent6, false, market1, "standard", dimensions6);
        Car car7 = new Car(producent7, false, market2, "medium", dimensions1);
        Car car8 = new Car(producent8, false, market3, "standard", dimensions2);
        Car car9 = new Car(producent9, false, market4, "premium", dimensions3);
        Car car10 = new Car(producent10, false, market5, "premium", dimensions4);
        Car car11 = new Car(producent1, false, market1, "medium", dimensions5);
        Car car12 = new Car(producent4, false, market2, "medium", dimensions6);
        Car car13 = new Car(producent5, false, market3, "standard", dimensions1);
        Car car14 = new Car(producent9, false, market4, "premium", dimensions1);
        Car car15 = new Car(producent7, false, market5, "standard", dimensions2);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
        cars.add(car11);
        cars.add(car12);
        cars.add(car13);
        cars.add(car14);
        cars.add(car15);

        Car.findCarInfo(cars, "BMW", true, 300);
    }
}
