package samtaylor.calculator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class CalculatorButton extends android.widget.Button implements Button
{
    public CalculatorButton( Context context )
    {
        super( context );
    }

    public CalculatorButton( Context context, AttributeSet attrs )
    {
        super( context, attrs );
    }

    public CalculatorButton( Context context, AttributeSet attrs, int defStyleAttr )
    {
        super( context, attrs, defStyleAttr );
    }

    public CalculatorButton( Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes )
    {
        super( context, attrs, defStyleAttr, defStyleRes );
    }

    @Override
    public void setOnClick( OnClick onClick )
    {

    }
}
