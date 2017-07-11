package samtaylor.calculator;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.Locale;

public class CalculatorDisplay extends TextView implements Display
{
    private boolean resetPending;

    public CalculatorDisplay( Context context )
    {
        super( context );
        this.init();
    }

    public CalculatorDisplay( Context context, AttributeSet attrs )
    {
        super( context, attrs );
        this.init();
    }

    public CalculatorDisplay( Context context, AttributeSet attrs, int defStyleAttr )
    {
        super( context, attrs, defStyleAttr );
        this.init();
    }

    public CalculatorDisplay( Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes )
    {
        super( context, attrs, defStyleAttr, defStyleRes );
        this.init();
    }

    @Override
    public void append( int number )
    {
        if ( this.resetPending )
        {
            this.setText( "" + number );
            this.resetPending = false;
        }
        else
        {
            if ( this.getText().equals( "0" ) || this.resetPending )
            {
                if ( number != 0 || this.resetPending )
                {
                    this.setText( "" + number );
                }
            }
            else
            {
                this.setText( this.getText() + "" + number );
            }
        }
    }

    @Override
    public void addDecimal()
    {
        if ( this.resetPending )
        {
            this.setText( "0." );
            this.resetPending = false;
        }
        else
        {
            if ( !this.getText().toString().contains( "." ) )
            {
                this.setText( this.getText() + "." );
            }
        }
    }

    @Override
    public void resetPending()
    {
        this.resetPending = true;
    }

    @Override
    public void setValue( float value )
    {
        this.setText( this.format( value ) );
    }

    @Override
    public float getValue()
    {
        return Float.parseFloat( this.getText().toString() );
    }

    private void init()
    {
        this.setText( "0" );
    }

    private String format( float value )
    {
        if ( value == ( int )value )
        {
            return String.format( Locale.ENGLISH, "%d", ( int )value );
        }
        else
        {
            return String.format( Locale.ENGLISH, "%s", value );
        }
    }
}
