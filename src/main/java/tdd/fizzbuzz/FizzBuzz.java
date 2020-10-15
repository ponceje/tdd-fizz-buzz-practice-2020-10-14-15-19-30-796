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
        if(isModulo(orderNumber, THREE) && isModulo(orderNumber, FIVE) && isModulo(orderNumber, SEVEN)){
            return new StringBuilder().append(FIZZ).append(BUZZ).append(WHIZZ).toString();
        }
        if(isModulo(orderNumber, THREE) && isModulo(orderNumber, FIVE)){
            return new StringBuilder().append(FIZZ).append(BUZZ).toString();
        }
        if(isModulo(orderNumber, THREE) && isModulo(orderNumber, SEVEN)){
            return new StringBuilder().append(FIZZ).append(WHIZZ).toString();
        }
        if(isModulo(orderNumber, FIVE) && isModulo(orderNumber, SEVEN)){
            return new StringBuilder().append(BUZZ).append(WHIZZ).toString();
        }
        if(isModulo(orderNumber, THREE)){
            return FIZZ;
        }
        if(isModulo(orderNumber, FIVE)){
            return BUZZ;
        }
        if(isModulo(orderNumber, 7)){
            return WHIZZ;
        }
        return String.valueOf(orderNumber);
    }

    private boolean isModulo(int orderNumber, int modulo) {
        return orderNumber % modulo == ZERO;
    }

}
