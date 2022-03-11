import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private String name;
    private Country country1;
    private Country country2;
    private Country country3;
    public  List<Country> countries=new ArrayList<>();


    public Market(String name,@NotNull Country country1, @NotNull Country country2, @NotNull Country country3) {
        this.name = name;
      this.country1=new Country(country1.getCountryName(), country1.getCountrySign());
      this.country2=new Country(country2.getCountryName(), country2.getCountrySign());
      this.country3=new Country(country3.getCountryName(), country3.getCountrySign());
      countries.add(country1);
      countries.add(country2);
      countries.add(country3);
    }

}
