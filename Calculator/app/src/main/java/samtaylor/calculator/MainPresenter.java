package samtaylor.calculator;

public class MainPresenter
{
    public MainPresenter( Button zeroButton,
                          Button oneButton,
                          Button twoButton,
                          Button threeButton,
                          Button fourButton,
                          Button fiveButton,
                          Button sixButton,
                          Button sevenButton,
                          Button eightButton,
                          Button nineButton,
                          Button pointButton,
                          Button equalsButton,
                          Button plusButton,
                          Button minusButton,
                          Button multiplyButton,
                          Button divideButton,
                          final Display display )
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

            }
        } );

        plusButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {

            }
        } );

        minusButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {

            }
        } );

        multiplyButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {

            }
        } );

        divideButton.setOnClick( new Button.OnClick()
        {
            @Override
            public void onClick()
            {

            }
        } );
    }
}
