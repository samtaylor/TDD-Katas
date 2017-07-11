package samtaylor.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainPresenterShould
{

    private CapturingButton zeroButton;
    private CapturingButton oneButton;
    private CapturingButton twoButton;
    private CapturingButton threeButton;
    private CapturingButton fourButton;
    private CapturingButton fiveButton;
    private CapturingButton sixButton;
    private CapturingButton sevenButton;
    private CapturingButton eightButton;
    private CapturingButton nineButton;
    private CapturingButton pointButton;
    private CapturingButton equalsButton;
    private CapturingButton plusButton;
    private CapturingButton minusButton;
    private CapturingButton multiplyButton;
    private CapturingButton divideButton;
    private CapturingDisplay display;
    private CapturingCalculator calculator;

    @Before
    public void setup()
    {
        this.zeroButton = new CapturingButton();
        this.oneButton = new CapturingButton();
        this.twoButton = new CapturingButton();
        this.threeButton = new CapturingButton();
        this.fourButton = new CapturingButton();
        this.fiveButton = new CapturingButton();
        this.sixButton = new CapturingButton();
        this.sevenButton = new CapturingButton();
        this.eightButton = new CapturingButton();
        this.nineButton = new CapturingButton();
        this.pointButton = new CapturingButton();
        this.equalsButton = new CapturingButton();
        this.plusButton = new CapturingButton();
        this.minusButton = new CapturingButton();
        this.multiplyButton = new CapturingButton();
        this.divideButton = new CapturingButton();
        this.display = new CapturingDisplay();
        this.calculator = new CapturingCalculator();

        new MainPresenter( this.zeroButton,
                           this.oneButton,
                           this.twoButton,
                           this.threeButton,
                           this.fourButton,
                           this.fiveButton,
                           this.sixButton,
                           this.sevenButton,
                           this.eightButton,
                           this.nineButton,
                           this.pointButton,
                           this.equalsButton,
                           this.plusButton,
                           this.minusButton,
                           this.multiplyButton,
                           this.divideButton,
                           this.display,
                           this.calculator );
    }

    @Test
    public void registerForButtonEvents()
    {
        assertThat( this.zeroButton.setOnClickInvoked, is ( true ) );
        assertThat( this.oneButton.setOnClickInvoked, is ( true ) );
        assertThat( this.twoButton.setOnClickInvoked, is ( true ) );
        assertThat( this.threeButton.setOnClickInvoked, is ( true ) );
        assertThat( this.fourButton.setOnClickInvoked, is ( true ) );
        assertThat( this.fiveButton.setOnClickInvoked, is ( true ) );
        assertThat( this.sixButton.setOnClickInvoked, is ( true ) );
        assertThat( this.sevenButton.setOnClickInvoked, is ( true ) );
        assertThat( this.eightButton.setOnClickInvoked, is ( true ) );
        assertThat( this.nineButton.setOnClickInvoked, is ( true ) );
        assertThat( this.pointButton.setOnClickInvoked, is ( true ) );
        assertThat( this.equalsButton.setOnClickInvoked, is ( true ) );
        assertThat( this.plusButton.setOnClickInvoked, is ( true ) );
        assertThat( this.minusButton.setOnClickInvoked, is ( true ) );
        assertThat( this.multiplyButton.setOnClickInvoked, is ( true ) );
        assertThat( this.divideButton.setOnClickInvoked, is ( true ) );
    }

    @Test
    public void appendZeroToTheDisplay_whenZeroButtonPressed()
    {
        this.zeroButton.click();

        assertThat( this.display.appendInvokedWithNumber, is( 0 ) );
    }

    @Test
    public void appendOneToTheDisplay_whenOneButtonPressed()
    {
        this.oneButton.click();

        assertThat( this.display.appendInvokedWithNumber, is( 1 ) );
    }

    @Test
    public void appendTwoToTheDisplay_whenTwoButtonPressed()
    {
        this.twoButton.click();

        assertThat( this.display.appendInvokedWithNumber, is( 2 ) );
    }

    @Test
    public void appendThreeToTheDisplay_whenThreeButtonPressed()
    {
        this.threeButton.click();

        assertThat( this.display.appendInvokedWithNumber, is( 3 ) );
    }

    @Test
    public void appendFourToTheDisplay_whenFourButtonPressed()
    {
        this.fourButton.click();

        assertThat( this.display.appendInvokedWithNumber, is( 4 ) );
    }

    @Test
    public void appendFiveToTheDisplay_whenFiveButtonPressed()
    {
        this.fiveButton.click();

        assertThat( this.display.appendInvokedWithNumber, is( 5 ) );
    }

    @Test
    public void appendSixToTheDisplay_whenSixButtonPressed()
    {
        this.sixButton.click();

        assertThat( this.display.appendInvokedWithNumber, is( 6 ) );
    }

    @Test
    public void appendSevenToTheDisplay_whenSevenButtonPressed()
    {
        this.sevenButton.click();

        assertThat( this.display.appendInvokedWithNumber, is( 7 ) );
    }

    @Test
    public void appendEightToTheDisplay_whenEightButtonPressed()
    {
        this.eightButton.click();

        assertThat( this.display.appendInvokedWithNumber, is( 8 ) );
    }

    @Test
    public void appendNineToTheDisplay_whenNineButtonPressed()
    {
        this.nineButton.click();

        assertThat( this.display.appendInvokedWithNumber, is( 9 ) );
    }

    @Test
    public void addDecimalToTheDisplay_whenThePointButtonIsPressed()
    {
        this.pointButton.click();

        assertThat( this.display.addDecimalInvoked, is( true ) );
    }

    @Test
    public void tellTheDisplayAResetIsPending_whenThePlusButtonIsPressed()
    {
        this.plusButton.click();

        assertThat( this.display.resetPendingInvoked, is( true ) );
    }

    @Test
    public void tellTheDisplayAResetIsPending_whenTheMinusButtonIsPressed()
    {
        this.minusButton.click();

        assertThat( this.display.resetPendingInvoked, is( true ) );
    }

    @Test
    public void tellTheDisplayAResetIsPending_whenTheMultiplyButtonIsPressed()
    {
        this.multiplyButton.click();

        assertThat( this.display.resetPendingInvoked, is( true ) );
    }

    @Test
    public void tellTheDisplayAResetIsPending_whenTheDivideButtonIsPressed()
    {
        this.divideButton.click();

        assertThat( this.display.resetPendingInvoked, is( true ) );
    }

    @Test
    public void passTheCorrectValueToCalculator_whenAddButtonIsPressed()
    {
        this.plusButton.click();

        assertThat( this.calculator.setInvokedWithAction, is( Calculator.Action.PLUS ) );
        assertThat( this.calculator.setInvokedWithNumber, is( 1.234f ) );
    }

    @Test
    public void passTheCorrectValueToCalculator_whenMinusButtonIsPressed()
    {
        this.minusButton.click();

        assertThat( this.calculator.setInvokedWithAction, is( Calculator.Action.MINUS ) );
        assertThat( this.calculator.setInvokedWithNumber, is( 1.234f ) );
    }

    @Test
    public void passTheCorrectValueToCalculator_whenMultiplyButtonIsPressed()
    {
        this.multiplyButton.click();

        assertThat( this.calculator.setInvokedWithAction, is( Calculator.Action.MULTIPLY ) );
        assertThat( this.calculator.setInvokedWithNumber, is( 1.234f ) );
    }

    @Test
    public void passTheCorrectValueToCalculator_whenDivideButtonIsPressed()
    {
        this.divideButton.click();

        assertThat( this.calculator.setInvokedWithAction, is( Calculator.Action.DIVIDE ) );
        assertThat( this.calculator.setInvokedWithNumber, is( 1.234f ) );
    }

    @Test
    public void passTheCorrectValueToCalculator_whenEqualsButtonIsPressed()
    {
        this.equalsButton.click();

        assertThat( this.calculator.equalsInvokedWithNumber, is( 1.234f ) );
    }

    @Test
    public void displayIsGivenResultFromCalculator_whenEqualsButtonIsPressed()
    {
        this.equalsButton.click();

        assertThat( this.display.setValueInvokedWithValue, is( 6.789f ) );
    }

    private static class CapturingButton implements Button
    {
        private boolean setOnClickInvoked;
        private OnClick onClick;

        @Override
        public void setOnClick( OnClick onClick )
        {
            this.setOnClickInvoked = true;
            this.onClick = onClick;
        }

        private void click()
        {
            this.onClick.onClick();
        }
    }

    private static class CapturingDisplay implements Display
    {
        private int appendInvokedWithNumber = -1;
        private boolean addDecimalInvoked = false;
        private boolean resetPendingInvoked;
        private float setValueInvokedWithValue;

        @Override
        public void append( int number )
        {
            this.appendInvokedWithNumber = number;
        }

        @Override
        public void addDecimal()
        {
            this.addDecimalInvoked = true;
        }

        @Override
        public void resetPending()
        {
            this.resetPendingInvoked = true;
        }

        @Override
        public void setValue( float value )
        {
            this.setValueInvokedWithValue = value;
        }

        @Override
        public float getValue()
        {
            return 1.234f;
        }
    }

    private static class CapturingCalculator implements Calculator
    {
        private Action setInvokedWithAction;
        private float setInvokedWithNumber;
        private float equalsInvokedWithNumber;

        @Override
        public void set( float number, Action action )
        {
            this.setInvokedWithNumber = number;
            this.setInvokedWithAction = action;
        }

        @Override
        public float equals( float number )
        {
            this.equalsInvokedWithNumber = number;
            return 6.789f;
        }
    }
}