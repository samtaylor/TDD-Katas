package samtaylor.calculator;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        new MainPresenter( ( CalculatorButton ) this.findViewById( R.id.button_zero ),
                ( CalculatorButton ) this.findViewById( R.id.button_one ),
                ( CalculatorButton ) this.findViewById( R.id.button_two ),
                ( CalculatorButton ) this.findViewById( R.id.button_three ),
                ( CalculatorButton ) this.findViewById( R.id.button_four ),
                ( CalculatorButton ) this.findViewById( R.id.button_five ),
                ( CalculatorButton ) this.findViewById( R.id.button_six ),
                ( CalculatorButton ) this.findViewById( R.id.button_seven ),
                ( CalculatorButton ) this.findViewById( R.id.button_eight ),
                ( CalculatorButton ) this.findViewById( R.id.button_nine ),
                ( CalculatorButton ) this.findViewById( R.id.button_point ),
                ( CalculatorButton ) this.findViewById( R.id.button_equals ),
                ( CalculatorButton ) this.findViewById( R.id.button_plus ),
                ( CalculatorButton ) this.findViewById( R.id.button_minus ),
                ( CalculatorButton ) this.findViewById( R.id.button_multiply ),
                ( CalculatorButton ) this.findViewById( R.id.button_divide ),
                ( CalculatorDisplay ) this.findViewById( R.id.result_text ),
                new SimpleCalculator() );
    }
}
