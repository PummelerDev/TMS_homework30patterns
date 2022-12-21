package builder;

import builder.Country;

public class Main {
    public static void main(String[] args) {

        Country poland = new Country.Builder().withName("Poland").withCurrency("zloty").
                withReligions("catholicism").build();

        System.out.println(poland.toString());


    }
}
