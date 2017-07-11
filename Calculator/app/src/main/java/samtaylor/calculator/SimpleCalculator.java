package samtaylor.calculator;

class SimpleCalculator implements Calculator
{
    private float currentValue;
    private Action currentAction = null;

    @Override
    public void set( float number, Action action )
    {
        if ( this.currentAction == null )
        {
            this.currentValue = number;
        }
        else
        {
            this.performAction( number );
        }

        this.currentAction = action;
    }

    @Override
    public float equals( float number )
    {
        this.performAction( number );
        this.currentAction = null;

        return this.currentValue;
    }

    private void performAction( float number )
    {
        switch ( this.currentAction )
        {
            case PLUS:
            {
                this.currentValue += number;
            }
            break;

            case MINUS:
            {
                this.currentValue -= number;
            }
            break;

            case MULTIPLY:
            {
                this.currentValue *= number;
            }
            break;

            case DIVIDE:
            {
                this.currentValue /= number;
            }
            break;

        }
    }
}
