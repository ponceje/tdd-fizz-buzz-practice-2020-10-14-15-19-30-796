package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final int ZERO = 0;
    public static final int THREE = 3;
    public static final int FIVE = 5;
    public static final int SEVEN = 7;

    public String getResult(int orderNumber){
        String result=null;
        if(isModulo(orderNumber, THREE)){
            result+=FIZZ;
        }
        if(isModulo(orderNumber, FIVE)){
            result+=BUZZ;
        }
        if(isModulo(orderNumber, 7)){
            result+=WHIZZ;
        }
        return result;
    }

    private boolean isModulo(int orderNumber, int modulo) {
        return orderNumber % modulo == ZERO;
    }

}
