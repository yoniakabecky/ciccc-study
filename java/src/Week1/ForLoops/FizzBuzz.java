package Week1.ForLoops;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean fizz = false;
            boolean buzz = false;
            String result = "";

            if (i % 3 == 0) fizz = true;
            if (i % 5 == 0) buzz = true;

            if (fizz) result = result + "Fizz";
            if (buzz) result = result + "Buzz";
            if (!fizz && !buzz) result = Integer.toString(i);

            System.out.println(result);
        }
    }
}
