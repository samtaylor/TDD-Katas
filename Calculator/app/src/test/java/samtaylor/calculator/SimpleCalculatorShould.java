package samtaylor.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SimpleCalculatorShould
{
    private Calculator calculator;

    @Before
    public void setup()
    {
        this.calculator = new SimpleCalculator();
    }

    @Test
    public void addTwoNumbers()
    {
        this.calculator.set( 4.0f, Calculator.Action.PLUS );

        assertThat( this.calculator.equals( 3.0f ), is( 7.0f ) );
    }

    @Test
    public void subtractTwoNumbers()
    {
        this.calculator.set( 10.7f, Calculator.Action.MINUS );

        assertThat( this.calculator.equals( 5.2f ), is( 5.5f ) );
    }

    @Test
    public void multiplyTwoNumbers()
    {
        this.calculator.set( 3.14f, Calculator.Action.MULTIPLY );

        assertThat( this.calculator.equals( 2 ), is ( 6.28f ) );
    }

    @Test
    public void divideTwoNumbers()
    {
        this.calculator.set( 25.0f, Calculator.Action.DIVIDE );

        assertThat( this.calculator.equals( 4.0f ), is( 6.25f ) );
    }
}
