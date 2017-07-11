package samtaylor.calculator;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith( AndroidJUnit4.class )
public class CalculatorButtonShould
{
    @Test
    public void triggerListener_whenButtonIsClicked()
    {
        CalculatorButton testButton = new CalculatorButton( InstrumentationRegistry.getContext() );
        CapturingOnClick onClick = new CapturingOnClick();
        testButton.setOnClick( onClick );

        testButton.callOnClick();

        assertThat( onClick.onClickInvoked, is( true ) );
    }

    private static class CapturingOnClick implements Button.OnClick
    {
        private boolean onClickInvoked;

        @Override
        public void onClick()
        {
            this.onClickInvoked = true;
        }
    }
}