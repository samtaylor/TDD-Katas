package samtaylor.calculator;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith( AndroidJUnit4.class )
public class CalculatorDisplayShould
{
    @Test
    public void appendTheNumberToTheTextView_whenAppendIsCalled()
    {
        CalculatorDisplay testDisplay = new CalculatorDisplay( InstrumentationRegistry.getContext() );

        testDisplay.append( 3 );
        testDisplay.append( 4 );
        testDisplay.append( 7 );

        assertThat( testDisplay.getText().toString(), is( "347" ) );
    }
}
