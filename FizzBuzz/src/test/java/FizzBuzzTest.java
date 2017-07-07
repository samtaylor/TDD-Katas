import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest
{
  @Test
  public void shouldReturnFizz_whenNumberIsDivisibleByThree()
  {
    assertEquals( new FizzBuzz().fizzBuzz( 3 ), "fizz" );
  }

  @Test
  public void shouldReturnBuzz_whenNumberIsDivisibleByFive()
  {
    assertEquals( new FizzBuzz().fizzBuzz( 5 ), "buzz" );
  }

  @Test
  public void shouldReturnFizzBuzz_whenNumberIsDivisibleByThreeAndFive()
  {
    assertEquals( new FizzBuzz().fizzBuzz( 15 ), "fizzbuzz" );
  }

  @Test
  public void shouldReturnTheNumber_whenNumberIsNotDivisibleByThreeOrFive()
  {
    assertEquals( new FizzBuzz().fizzBuzz( 1 ), "1" );
  }
}
