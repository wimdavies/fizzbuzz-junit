package fizzbuzz_junit;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz1Returns1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.forNumber(1));
    }

    @Test
    public void testFizzBuzz2Returns2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("2", fizzBuzz.forNumber(2));
    }

    @Test
    public void testFizzBuzz3sReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzBuzz.forNumber(3));
        Assert.assertEquals("Fizz", fizzBuzz.forNumber(6));
    }

    @Test
    public void testFizzBuzz5sReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzBuzz.forNumber(5));
        Assert.assertEquals("Buzz", fizzBuzz.forNumber(10));
    }

    @Test
    public void testFizzBuzz3sAnd5sReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("FizzBuzz", fizzBuzz.forNumber(15));
        Assert.assertEquals("FizzBuzz", fizzBuzz.forNumber(30));
    }
}
