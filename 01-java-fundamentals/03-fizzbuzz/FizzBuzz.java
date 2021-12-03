public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzBuzz login here - returns "Fizz", "Buzz", "FizzBuzz" or a String cast of the number itself.  Hint: You can use a String method to cast the int to a String.
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        else if (number % 5 == 0) {
            return "Buzz";
        }
        else if (number % 3 == 0) {
            return "Fizz";
        }
        else
            return String.valueOf(number);
    }

    // NINJA BONUS: Create an overloaded method for fizzBuzz
    public String fizzBuzz(int number, String multOf3Word, String multOf5Word, String multOf15Word) {
        // Implement the same logic, but replace "Fizz", "Buzz", and "FizzBuzz" with the given words
        return "testing";
    }
}