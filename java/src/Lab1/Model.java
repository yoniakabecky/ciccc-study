package Lab1;

/**
 * Lab 1
 * @author Yoni
 */

public class Model {

    // ATTRIBUTES
    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;
    private static String occupation = "modeling";


    // CONSTRUCTORS
    // first constructor: the no-arg constructor which dose nothing
    public Model() {

    }

    /**
     * second constructor: the first six fields to be passed in as parameters
     * first and last name must be 3 to 20 char long
     *
     * @param firstName first name
     * @param lastName  last name
     * @param height    inches
     * @param weightKg  pounds
     * @param canTravel travel
     * @param smokes    smokes
     */
    public Model(String firstName, String lastName, int height, double weightKg, boolean canTravel, boolean smokes) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weightKg);        // pass as Kg -> setWeight(long kg)
        setCanTravel(canTravel);
        setSmokes(smokes);
    }

    /**
     * third constructor: takes parameters first and last name, height in inches, weight in pounds
     * set canTravel to true and smokes to false
     *
     * @param firstName     first name
     * @param lastName      last name
     * @param height        height
     * @param weight        weight
     */
    public Model(String firstName, String lastName, int height, double weight) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(true);
        setSmokes(false);
    }


    // ACCESSOR - GETTERS
    /**
     * getter for first name
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * getter for last name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * getter for height
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * getter for height as feet and inches
     * @return feet and inches
     */
    public String getHeightInFeetAndInches() {

        int feet = height / 12;
        int inches = height % 12;

        String feetUnit = "";
        if (feet > 1) {
            feetUnit = feet + " feet ";
        } else if (feet == 1) {
            feetUnit = feet + " foot ";
        }

        String inchUnit = "";
        if (inches > 1) {
            inchUnit = inches + " inches";
        } else if (inches == 1) {
            inchUnit = inches + " inch";
        }

        return feetUnit + inchUnit;
    }

    /**
     * getter for Height as CM
     * @return  Height cm
     */
    public String getHeightInCm() {
        return Math.round(height * 2.54) + " cm";
    }

    /**
     * getter for weight
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * getter for weight as Kg
     * @return weight as Kgs
     */
    public long getWeightKg() {
        return Math.round(weight * 0.453592);
    }

    /**
     * getter for can travel
     * @return canTravel
     */
    public boolean isCanTravel() {
        return canTravel;
    }

    /**
     * getter for smokes
     * @return smokes
     */
    public boolean isSmokes() {
        return smokes;
    }

    /**
     * getter for occupation
     * @return occupation
     */
    public static String getOccupation() {
        return occupation;
    }


    // MUTATOR - SETTER (final: can't over write)

    /**
     * setter for first name
     * @param firstName first name
     */
    public final void setFirstName(String firstName) {
        if ((firstName != null) && (firstName.length() >= 3) && (firstName.length() <= 20)) {
            this.firstName = firstName;
        }
    }

    /**
     * setter for last name
     * @param lastName  last name
     */
    public final void setLastName(String lastName) {
        if ((lastName != null) && (lastName.length() >= 3) && (lastName.length() <= 20)) {
            this.lastName = lastName;
        }
    }

    /**
     * setter for height
     * @param inches height
     */
    public final void setHeight(int inches) {
        if ((inches >= 24) && (inches <= 84)) {
            this.height = inches;
        }
    }

    /**
     * setter for height (feet and inches)
     * @param feet      feet
     * @param inches    inches
     */
    public final void setHeight(int feet, int inches) {
        int inInches =  feet * 12 + inches;
        setHeight(inInches);
    }

    /**
     * setter for weight (pounds)
     * @param pounds    pounds
     */
    public final void setWeight(double pounds) {
        if ((pounds >= 80) && (pounds <= 280)) {
            this.weight = pounds;
        }
    }

    /**
     * setter for weight (kgs)
     * @param kilograms kg
     */
    public final void setWeight(long kilograms) {
        double inPounds = kilograms * 2.205;
        setWeight(inPounds);
    }

    /**
     * setter for can travel
     * @param canTravel     travel
     */
    public final void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     * setter for smokes
     * @param smokes    smokes
     */
    public final void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }


    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
        if (canTravel == true) {
            System.out.println("Does travel");
        } else {
            System.out.println("Does not travel");
        }
        if (smokes == true) {
            System.out.println("Does smoke");
        } else {
            System.out.println("Does not smoke");
        }
    }

    // for Lab 1b
    public static final int INCHES_PER_FOOT = 12;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    // Calculates a model's per-hour pay rate and returns the amount.
    public int calculatePayDollarsPerHour() {
        int hourlyPay = BASE_RATE_DOLLARS_PER_HOUR;
        if ((height >= TALL_INCHES) || (weight <= THIN_POUNDS)) {
            hourlyPay += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }
        if (canTravel == true) {
            hourlyPay += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        if (smokes == true) {
            hourlyPay -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        return hourlyPay;
    }


    public void displayModelDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + getWeight() + " pounds");
        if (canTravel == true) {
            System.out.println("Travels: yep");
        } else {
            System.out.println("Travels: nope");
        }
        if (smokes == true) {
            System.out.println("Smokes: yep");
        } else {
            System.out.println("Smokes: nope");
        }
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
    }

    public void displayModelDetails(boolean metricUnits) {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        if (metricUnits) {
            System.out.println("Height: " + getHeightInCm());
            System.out.println("Weight: " + getWeightKg() + " kg");
        } else {
            System.out.println("Height: " + getHeightInFeetAndInches());
            System.out.println("Weight: " + getWeight() + " pounds");
        }
        if (canTravel == true) {
            System.out.println("Travels: yep");
        } else {
            System.out.println("Travels: nope");
        }
        if (smokes == true) {
            System.out.println("Smokes: yep");
        } else {
            System.out.println("Smokes: nope");
        }
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
    }
}
