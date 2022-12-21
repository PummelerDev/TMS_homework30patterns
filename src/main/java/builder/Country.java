package builder;

import java.util.Objects;

public class Country {
    private String name;
    private String population;
    private String continent;
    private String timeZone;
    private String theStateSystem;
    private String religions;
    private String numberOfCities;
    private String neighboringCountries;
    private String gdp;
    private String currency;

    @Override
    public String toString() {
        return "Country [name=" + name + ", population=" + population + ", continent=" + continent + ", timeZone="
                + timeZone + ", theStateSystem=" + theStateSystem + ", religions=" + religions + ", numberOfCities="
                + numberOfCities + ", neighboringCountries=" + neighboringCountries + ", gdp=" + gdp + ", currency="
                + currency + "]";
    }

   public static class Builder {
        private Country country = null;

        public Builder() {
            country = new Country();
        }

        public Builder withName(String name) {
            country.name = name;
            return this;
        }

        public Builder withPopulation(String population) {
            country.population = population;
            return this;
        }

        public Builder withContinent(String continent) {
            country.continent = continent;
            return this;
        }

        public Builder withTimeZone(String timeZone) {
            country.timeZone = timeZone;
            return this;
        }

        public Builder withTheStateSystem(String theStateSystem) {
            country.theStateSystem = theStateSystem;
            return this;
        }

        public Builder withReligions(String religions) {
            country.religions = religions;
            return this;
        }

        public Builder withNumberOfCities(String numberOfCities) {
            country.numberOfCities = numberOfCities;
            return this;
        }

        public Builder withNeighboringCountries(String neighboringCountries) {
            country.neighboringCountries = neighboringCountries;
            return this;
        }

        public Builder withGdp(String gdp) {
            country.gdp = gdp;
            return this;
        }

       public Builder withCurrency(String currency) {
            country.currency = currency;
            return this;
        }

        public Country build() {
            return country;
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTheStateSystem() {
        return theStateSystem;
    }

    public void setTheStateSystem(String theStateSystem) {
        this.theStateSystem = theStateSystem;
    }

    public String getReligions() {
        return religions;
    }

    public void setReligions(String religions) {
        this.religions = religions;
    }

    public String getNumberOfCities() {
        return numberOfCities;
    }

    public void setNumberOfCities(String numberOfCities) {
        this.numberOfCities = numberOfCities;
    }

    public String getNeighboringCountries() {
        return neighboringCountries;
    }

    public void setNeighboringCountries(String neighboringCountries) {
        this.neighboringCountries = neighboringCountries;
    }

    public String getGdp() {
        return gdp;
    }

    public void setGdp(String gdp) {
        this.gdp = gdp;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name) && Objects.equals(population, country.population) && Objects.equals(continent, country.continent) && Objects.equals(timeZone, country.timeZone) && Objects.equals(theStateSystem, country.theStateSystem) && Objects.equals(religions, country.religions) && Objects.equals(numberOfCities, country.numberOfCities) && Objects.equals(neighboringCountries, country.neighboringCountries) && Objects.equals(gdp, country.gdp) && Objects.equals(currency, country.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population, continent, timeZone, theStateSystem, religions, numberOfCities, neighboringCountries, gdp, currency);
    }

}
