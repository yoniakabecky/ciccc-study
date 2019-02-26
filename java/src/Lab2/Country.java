package Lab2;

public class Country {

    String countryName;
    Province[] provinces;

    // default constructor:
    // creates an Array of ten Province objects,
    // to match Canada’s real provinces
    public Country() {
        countryName = "Canada";
        provinces = new Province[] {new Province("Ontario", "Toronto", 13),
                new Province("Quebec", "Quebec City", 8),
                new Province("Nova Scotia", "Halifax", 1),
                new Province("New Brunswick", "Fredericton", 1),
                new Province("Manitoba", "Winnipeg", 1),
                new Province("British Columbia", "Victoria", 5),
                new Province("Prince Edward Island", "Charlottetown", 0),
                new Province("Saskatchewan", "Regina", 1),
                new Province("Alberta", "Edmonton", 4),
                new Province("Newfoundland and Labrador", "St. John's", 1)};

    }


    // loops through the deck and prints each Province object’s getDetails() method.
    // Note: Use for-each loop.
    public void displayAllProvinces() {
        for (Province province: provinces) {
            System.out.println(province.getDetails());
        }
    }


    // takes the population in millions (e.g. 4, 6) and returns how many Provinces
    // there are with populations in that range (e.g. 4-6 million, inclusive).
    // Note: Use for-each loop.
    public int howManyHaveThisPopulation(int min, int max) {
        int count = 0;
        for(Province province: provinces) {
            if (province.getPopulationInMillions() >= min && province.getPopulationInMillions() <= max) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Country c = new Country();
        c.displayAllProvinces();
        System.out.println(c.howManyHaveThisPopulation(5,20));
    }

}


