package samtaylor.calculator;

public interface Calculator
{
    enum Action
    {
        PLUS, MINUS, MULTIPLY, DIVIDE
    }

    void set( float number, Action action );

    float equals( float number );
}
