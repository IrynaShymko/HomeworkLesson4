import java.util.ArrayList;
import java.util.List;

public class Market {
    private String marketName;
    private List<Country> countries;

    public Market(String marketName, Country country1, Country country2, Country country3) {
        this.marketName = marketName;
        List<Country> countries1 = new ArrayList<>();
        countries1.add(country1);
        countries1.add(country2);
        countries1.add(country3);
        this.countries = countries1;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
