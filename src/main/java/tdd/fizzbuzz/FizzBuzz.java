package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public String getResult(int orderNumber){
        if(orderNumber%3 == 0){
            return FIZZ;
        }
        return null;
    }
}
