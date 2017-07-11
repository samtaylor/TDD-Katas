package samtaylor.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainPresenterShould
{
    @Test
    public void registerForButtonEvents()
    {
        CapturingButton zeroButton = new CapturingButton();

        new MainPresenter( zeroButton,
                           new CapturingButton(),
                           new CapturingButton(),
                           new CapturingButton(),
                           new CapturingButton(),
                           new CapturingButton(),
                           new CapturingButton(),
                           new CapturingButton(),
                           new CapturingButton(),
                           new CapturingButton(),
                           new CapturingButton(),
                           new CapturingButton(),
                           new CapturingButton(),
                           new CapturingButton(),
                           new CapturingButton(),
                           new CapturingButton(),
                           new CapturingText() );

        assertThat( zeroButton.setOnClickInvoked, is ( true ) );
    }

    private static class CapturingButton implements Button
    {
        private boolean setOnClickInvoked;

        @Override
        public void setOnClick( OnClick onClick )
        {
            this.setOnClickInvoked = true;
        }
    }

    private static class CapturingText implements Text
    {

    }
}