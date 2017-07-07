public class FizzBuzz
{
  public static void main( String [] args )
  {
    new FizzBuzz().run();
  }

  private void run()
  {
    for ( int i = 1; i <= 100; i ++ )
    {
      System.out.println( i + " = " + this.fizzBuzz( i ) );
    }
  }

  public String fizzBuzz( int number )
  {
    if ( number % 3 == 0 )
    {
      if ( number % 5 == 0 )
      {
        return "fizzbuzz";
      }

      return "fizz";
    }
    else if ( number % 5 == 0 )
    {
      return "buzz";
    }

    return "" + number;
  }
}
