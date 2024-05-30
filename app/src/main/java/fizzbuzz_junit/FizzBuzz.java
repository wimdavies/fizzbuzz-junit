package fizzbuzz_junit;

public class FizzBuzz {
    public String forNumber(Integer number) {
        if (number % 3 == 0 & number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return number.toString();
        }
    }
}
