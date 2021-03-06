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
        int orderNumber = 7;
        //
        String result = fizzBuzz.getResult(orderNumber);
        //
        assertEquals(result,"Whizz");
    }
    @Test
    public void should_return_FizzBuzz_when_count_off_given_order_number(){
        //
        FizzBuzz fizzBuzz = new FizzBuzz();
        int orderNumber = 15;
        //
        String result = fizzBuzz.getResult(orderNumber);
        //
        assertEquals(result,"FizzBuzz");
    }
    @Test
    public void should_return_FizzWhiz_when_count_off_given_order_number(){
        //
        FizzBuzz fizzBuzz = new FizzBuzz();
        int orderNumber = 21;
        //
        String result = fizzBuzz.getResult(orderNumber);
        //
        assertEquals(result,"FizzWhizz");
    }
    @Test
    public void should_return_BuzzWhizz_when_count_off_given_order_number(){
        //
        FizzBuzz fizzBuzz = new FizzBuzz();
        int orderNumber = 35;
        //
        String result = fizzBuzz.getResult(orderNumber);
        //
        assertEquals(result,"BuzzWhizz");
    }
    @Test
    public void should_return_FizzBuzzWhizz_when_count_off_given_order_number(){
        //
        FizzBuzz fizzBuzz = new FizzBuzz();
        int orderNumber = 105;
        //
        String result = fizzBuzz.getResult(orderNumber);
        //
        assertEquals(result,"FizzBuzzWhizz");
    }
    @Test
    public void should_return_order_number_when_count_off_given_order_number(){
        //
        FizzBuzz fizzBuzz = new FizzBuzz();
        int orderNumber = 2;
        //
        String result = fizzBuzz.getResult(orderNumber);
        //
        assertEquals(result,"2");
    }


}
