/**
 * 
 * @author Sheril George
 * Write a program that prints each number from 1 to 20. 
 * conditions: if number is divisible by three print fizz instead of the number
 * if number is divisible by five print  Buzz
 * Id number is divisible by both three and five, then print Fizz Buzz
 * 
 *
 */
public class FizzBuzz {

    public void program()
    {
        for (int i = 1; i < 21; i++)
        {
            if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else if (i % 15 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else
            {
                System.out.print(i);
            }
        }
    }

}
