package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_Fizz_when_count_off_given_order_number(){
        //
        FizzBuzz fizzBuzz = new FizzBuzz();
        int orderNumber = 3;
        //
        String result = fizzBuzz.getResult(orderNumber);
        //
        assertEquals(result,"Fizz");
    }
    @Test
    public void should_return_Buzz_when_count_off_given_order_number(){
        //
        FizzBuzz fizzBuzz = new FizzBuzz();
        int orderNumber = 10;
        //
        String result = fizzBuzz.getResult(orderNumber);
        //
        assertEquals(result,"Buzz");
    }
    @Test
    public void should_return_Whizz_when_count_off_given_order_number(){
        //
        FizzBuzz fizzBuzz = new FizzBuzz();
        int orderNumber = 21;
        //
        String result = fizzBuzz.getResult(orderNumber);
        //
        assertEquals(result,"Whizz");
    }


}
