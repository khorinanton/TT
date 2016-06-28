public class Abstraction extends Expression {

    public Abstraction(AbstractExpression expression1, AbstractExpression expression2) {
        super(expression1, expression2);
    }

    public char getType() {
        return 'l';
    }

    public String toString() {
        String s = "\\" + expression1.toString() + ".";
        String tmp = expression2.toString();
        s += tmp;
        return s;
    }
}
