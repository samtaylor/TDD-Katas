package samtaylor.calculator;

public class MainPresenter
{
    public MainPresenter( final Button zeroButton,
                          final Button oneButton,
                          final Button twoButton,
                          final Button threeButton,
                          final Button fourButton,
                          final Button fiveButton,
                          final Button sixButton,
                          final Button sevenButton,
                          final Button eightButton,
                          final Button nineButton,
                          final Button pointButton,
                          final Button equalsButton,
                          final Button plusButton,
                          final Button minusButton,
                          final Button multiplyButton,
                          final Button divideButton,
                          final Display display,
                          final Calculator calculator )
    {
        zeroButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                display.append( 0 );
            }
        } );

        oneButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                display.append( 1 );
            }
        } );

        twoButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                display.append( 2 );
            }
        } );

        threeButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                display.append( 3 );
            }
        } );

        fourButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                display.append( 4 );
            }
        } );

        fiveButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                display.append( 5 );
            }
        } );

        sixButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                display.append( 6 );
            }
        } );

        sevenButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                display.append( 7 );
            }
        } );

        eightButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                display.append( 8 );
            }
        } );

        nineButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                display.append( 9 );
            }
        } );

        pointButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                display.addDecimal();
            }
        } );

        equalsButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                display.setValue( calculator.equals( display.getValue() ) );
            }
        } );

        plusButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                calculator.set( display.getValue(), Calculator.Action.PLUS );

                display.resetPending();
            }
        } );

        minusButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                calculator.set( display.getValue(), Calculator.Action.MINUS );

                display.resetPending();
            }
        } );

        multiplyButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                calculator.set( display.getValue(), Calculator.Action.MULTIPLY );

                display.resetPending();
            }
        } );

        divideButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {
                calculator.set( display.getValue(), Calculator.Action.DIVIDE );

                display.resetPending();
            }
        } );
    }
}
