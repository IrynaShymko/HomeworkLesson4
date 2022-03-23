import java.util.ArrayList;

public class Car {
    private Producent producent;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    private ArrayList<Dimension> dimensions;

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, ArrayList<Dimension> dimensions) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    public static void findCarInfo(ArrayList<Car> cars, String model, boolean automaticGear, int minTrankCapacity) {
        for (Car car : cars) {
            if (car.producent.getModel().equals(model) && car.isAutomaticGear == automaticGear) {
                for (Dimension d : car.dimensions) {
                    if (d.getTrankCapacity() > minTrankCapacity) {
                        for (Country country : car.market.getCountries()) {
                            System.out.println(country.getCountryName() + " - " + country.getCountrySign());
                        }
                        break;
                    } else {
                        System.out.println("Sorry, result is empty");
                        break;
                    }
                }
            }
        }
    }
}
