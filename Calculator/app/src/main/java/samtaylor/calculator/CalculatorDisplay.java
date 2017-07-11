package samtaylor.calculator;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class CalculatorDisplay extends TextView implements Display
{
    public CalculatorDisplay( Context context )
    {
        super( context );
    }

    public CalculatorDisplay( Context context, AttributeSet attrs )
    {
        super( context, attrs );
    }

    public CalculatorDisplay( Context context, AttributeSet attrs, int defStyleAttr )
    {
        super( context, attrs, defStyleAttr );
    }

    public CalculatorDisplay( Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes )
    {
        super( context, attrs, defStyleAttr, defStyleRes );
    }

    @Override
    public void append( int number )
    {
        this.setText( this.getText() + "" + number );
    }
}
