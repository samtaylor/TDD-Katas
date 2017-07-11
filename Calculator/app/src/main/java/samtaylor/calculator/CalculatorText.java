package samtaylor.calculator;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class CalculatorText extends TextView implements Text
{
    public CalculatorText( Context context )
    {
        super( context );
    }

    public CalculatorText( Context context, AttributeSet attrs )
    {
        super( context, attrs );
    }

    public CalculatorText( Context context, AttributeSet attrs, int defStyleAttr )
    {
        super( context, attrs, defStyleAttr );
    }

    public CalculatorText( Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes )
    {
        super( context, attrs, defStyleAttr, defStyleRes );
    }
}
