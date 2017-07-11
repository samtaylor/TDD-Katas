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

    @Test
    public void addThreeNumbers()
    {
        this.calculator.set( 2, Calculator.Action.PLUS );
        this.calculator.set( 4, Calculator.Action.PLUS );

        assertThat( this.calculator.equals( 4 ), is( 10f ) );
    }

    @Test
    public void addAndSubstractNumbers()
    {
        this.calculator.set( 10, Calculator.Action.MINUS );
        this.calculator.set( 5, Calculator.Action.PLUS );

        assertThat( this.calculator.equals( 1 ), is( 6f ) );
    }

    @Test
    public void multiplyAndDivideNumbers()
    {
        this.calculator.set( 10, Calculator.Action.MULTIPLY );
        this.calculator.set( 5, Calculator.Action.DIVIDE );

        assertThat( this.calculator.equals( 2 ), is( 25f ) );
    }

    @Test
    public void chainEqualsTogether()
    {
        this.calculator.set( 5, Calculator.Action.PLUS );
        assertThat( this.calculator.equals( 5 ), is( 10f ) );

        this.calculator.set( 10, Calculator.Action.PLUS );
        assertThat( this.calculator.equals( 11.1f ), is( 21.1f ) );
    }
}
