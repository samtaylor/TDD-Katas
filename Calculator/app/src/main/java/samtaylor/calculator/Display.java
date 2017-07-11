package samtaylor.calculator;

interface Display
{
    void append( int number );

    void addDecimal();

    void resetPending();

    void setValue( float value );

    float getValue();
}
