package samtaylor.calculator;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith( AndroidJUnit4.class )
public class CalculatorDisplayShould
{
    private CalculatorDisplay testDisplay;

    @Before
    public void setup()
    {
        this.testDisplay = new CalculatorDisplay( InstrumentationRegistry.getContext() );
    }

    @Test
    public void initialiseWithAZero()
    {
        assertThat( this.testDisplay.getText().toString(), is( "0" ) );
    }

    @Test
    public void appendTheNumberToTheTextView_whenAppendIsCalled()
    {
        this.testDisplay.append( 3 );
        this.testDisplay.append( 4 );
        this.testDisplay.append( 0 );
        this.testDisplay.append( 7 );

        assertThat( this.testDisplay.getText().toString(), is( "3407" ) );
    }

    @Test
    public void notIncludeLeadingZeros_whenAppendIsCalled()
    {
        this.testDisplay.append( 0 );
        this.testDisplay.append( 3 );

        assertThat( this.testDisplay.getText().toString(), is( "3" ) );
    }

    @Test
    public void addTheDecimal_whenAddDecimalIsCalled()
    {
        this.testDisplay.addDecimal();

        assertThat( this.testDisplay.getText().toString(), is( "0." ) );
    }

    @Test
    public void onlyAddTheDecimalOnce()
    {
        this.testDisplay.addDecimal();
        this.testDisplay.addDecimal();

        assertThat( this.testDisplay.getText().toString(), is( "0." ) );
    }

    @Test
    public void appendTheNumberAfterTheDecimal()
    {
        this.testDisplay.append( 4 );
        this.testDisplay.addDecimal();
        this.testDisplay.append( 7 );

        assertThat( this.testDisplay.getText().toString(), is( "4.7" ) );
    }
}
