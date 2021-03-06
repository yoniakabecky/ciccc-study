package Lab2;

public class Province {
    /* Instance variables */
    private String name;
    private String capital;
    private int populationInMillions;

    /* Constants */
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private static final String DEFAULT_CAPITAL = "Victoria";
    private static final int DEFAULT_POPULATION_MILLIONS = 4;

    /* constructor: take three parameters */
    public Province(String name, String capital, int populationInMillions) {
        if ((isValidPopulation(populationInMillions)) && (isValidProvince(name) && (isValidCapitalCity(capital)))) {
            this.populationInMillions = populationInMillions;
            this.name = name;
            this.capital = capital;
        } else {
            this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
            this.name = DEFAULT_CAPITAL;
            this.capital = DEFAULT_PROVINCE;

        }
    }

    // default constructor: no parameters
    public Province() {
        this.populationInMillions = 4;
        this.name = "British Columbia";
        this.capital = "Victoria";
    }


    // accessor and mutator
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulationInMillions() {
        return populationInMillions;
    }

    public void setPopulationInMilions(int populationInMilions) {
        this.populationInMillions = populationInMilions;
    }

    // method: contains a local Array of the 10 Canadian Province names,
    // and returns true if the String parameter exists in that Array;
    // otherwise it returns false. Use while-loop
    private boolean isValidProvince(String province) {
        String[] provinceNames = {
                "Ontario", "Quebec", "Nova Scotia", "New Brunswick",
                "Manitoba", "British Columbia", "Prince Edward Island",
                "Saskatchewan", "Alberta", "Newfoundland and Labrador"
        };

        int i = 0;
        while (i < provinceNames.length) {
            if (provinceNames[i] == province) {
                return true;
            }
            i++;
        }
        return false;
    }

    // method: a local Array of the 10 Canadian Province capital names,
    // and returns true if the String parameter exists in that Array;
    // otherwise it returns false. Use for-loop
    private boolean isValidCapitalCity(String capital) {
        String[] capitalNames = {
                "Toronto", "Quebec City", "Halifax", "Fredericton",
                "Winnipeg", "Victoria", "Charlottetown", "Regina",
                "Edmonton", "St. John's"
        };

        for (int i = 0; i < capitalNames.length; i++) {
            if (capitalNames[i] == capital) {
                return true;
            }
        }
        return false;
    }


    // method: returns true if the parameter is between 4 and 38 (inclusive);
    // otherwise it returns false.
    private boolean isValidPopulation(int population) {
        if (population >= 4 && population <= 38){
            return true;
        }
        return false;
    }

    // returns a String in the format
    public String getDetails() {
        return "The capital of " +getName()+
                " (pop. " +getPopulationInMillions()+
                " million) is " +getCapital()+ ".";

    }
}
