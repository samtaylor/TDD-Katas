package samtaylor.calculator;

interface Button
{
    void setOnClick( OnClick onClick );

    interface OnClick
    {
        void onClick();
    }
}
