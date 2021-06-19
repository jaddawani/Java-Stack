public class FizzBuzz {
    public static String fizzBuzz(int number) {
        if (number % 5 == 0 && number % 3 == 0 )
        {
            return "fizzbuzz";
        }
        if (number % 5 == 0)
        {
            return "buzz";
        }
        if  (number % 3 == 0 )
        {
            return "fizz";
        }
        return "number";
        
    }
    public static void main(String[] args) {
        String res = fizzBuzz(2);
      System.out.println(res);
    
    }
}