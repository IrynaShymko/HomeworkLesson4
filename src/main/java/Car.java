import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Car {
    Producent producent;
    boolean isAutomaticGear;
    Market market;
    String segment;
    public ArrayList<Dimension> dimensions= new ArrayList<>();
    Dimension dimension1;
    Dimension dimension2;
    Dimension dimension3;
    Dimension dimension4;
    Dimension dimension5;
    Dimension dimension6;
    Dimension dimension7;
    Dimension dimension8;
    Dimension dimension9;
    Dimension dimension10;


    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, Dimension dimension1,
               Dimension dimension2,Dimension dimension3,Dimension dimension4, Dimension dimension5, Dimension dimension6,
               Dimension dimension7, Dimension dimension8, Dimension dimension9, Dimension dimension10) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimension1 = new Dimension(dimension1.getHigh(), dimension1.getWidth(),dimension1.getTrankCapacity());
        this.dimension2 = new Dimension(dimension2.getHigh(), dimension2.getWidth(),dimension2.getTrankCapacity());
        this.dimension3 = new Dimension(dimension3.getHigh(), dimension3.getWidth(),dimension3.getTrankCapacity());
        this.dimension4 = new Dimension(dimension4.getHigh(), dimension4.getWidth(),dimension4.getTrankCapacity());
        this.dimension5 = new Dimension(dimension5.getHigh(), dimension5.getWidth(),dimension5.getTrankCapacity());
        this.dimension6 = new Dimension(dimension5.getHigh(), dimension6.getWidth(),dimension6.getTrankCapacity());
        this.dimension7 = new Dimension(dimension7.getHigh(), dimension7.getWidth(),dimension7.getTrankCapacity());
        this.dimension8 = new Dimension(dimension8.getHigh(), dimension8.getWidth(),dimension8.getTrankCapacity());
        this.dimension9 = new Dimension(dimension9.getHigh(), dimension9.getWidth(),dimension9.getTrankCapacity());
        this.dimension10 = new Dimension(dimension10.getHigh(), dimension10.getWidth(),dimension10.getTrankCapacity());

        dimensions.add(dimension1);
        dimensions.add(dimension2);
        dimensions.add(dimension3);
        dimensions.add(dimension4);
        dimensions.add(dimension5);
        dimensions.add(dimension6);
        dimensions.add(dimension7);
        dimensions.add(dimension8);
        dimensions.add(dimension9);
        dimensions.add(dimension10);
    }

    public static void findCarInfo(ArrayList<Car> cars){
        for (Car car: cars) {
            if (car.producent.getModel().equals("BMW")&& car.isAutomaticGear){
                for (Dimension dimension: car.dimensions){
                    if(dimension.getTrankCapacity()>300){
                        for (Country country: car.market.countries){
                            System.out.println(country.getCountryName()+ " - "+country.getCountrySign());
                        } break;
                    }
                }


                //car.dimensions.stream().filter(dimension -> dimension.trankCapacity>300);

            }
        }
    }
}

