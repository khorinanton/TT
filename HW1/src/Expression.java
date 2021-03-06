public abstract class Expression {

    public AbstractExpression expression1;
    public AbstractExpression expression2;

    public Expression(AbstractExpression expression1, AbstractExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    public abstract char getType();

    public abstract String toString();
}
