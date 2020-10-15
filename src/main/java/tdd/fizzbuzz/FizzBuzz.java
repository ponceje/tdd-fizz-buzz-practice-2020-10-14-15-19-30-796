package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String getResult(int orderNumber){
        if(orderNumber%3 == 0 && orderNumber%5 == 0){
            return new StringBuilder().append(FIZZ).append(BUZZ).toString();
        }
        else if(orderNumber%3 == 0){
            return FIZZ;
        }
        else if(orderNumber%5 == 0){
            return BUZZ;
        }
        else if(orderNumber%7 == 0){
            return WHIZZ;
        }
        return null;
    }
}
