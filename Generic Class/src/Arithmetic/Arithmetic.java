package Arithmetic;

@SuppressWarnings("unchecked")

public class Arithmetic <N1 extends Number, N2 extends Number> {
    public N1 num1;
    public N2 num2;

    public Arithmetic (N1 num1, N2 num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    public <Result extends Number> Result add() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (Result) Double.valueOf(num1.doubleValue() + num2.doubleValue());

        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (Result) Float.valueOf(num1.floatValue() + num2.floatValue());

        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (Result) Long.valueOf(num1.longValue() + num2.longValue());

        } else {
            return (Result) Integer.valueOf(num1.intValue() + num2.intValue());

        }
    }

    public <Result extends Number> Result subtract() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (Result) Double.valueOf(num1.doubleValue() - num2.doubleValue());

        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (Result) Float.valueOf(num1.floatValue() - num2.floatValue());

        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (Result) Long.valueOf(num1.longValue() - num2.longValue());

        } else {
            return (Result) Integer.valueOf(num1.intValue() - num2.intValue());

        }
    }

    public <Result extends Number> Result multiply() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (Result) Double.valueOf(num1.doubleValue() * num2.doubleValue());

        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (Result) Float.valueOf(num1.floatValue() * num2.floatValue());

        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (Result) Long.valueOf(num1.longValue() * num2.longValue());

        } else {
            return (Result) Integer.valueOf(num1.intValue() * num2.intValue());

        }
    }

    public <Result extends Number> Result divide() {
        try {
            if (num1 instanceof Double || num2 instanceof Double) {
                return (Result) Double.valueOf(num1.doubleValue() * num2.doubleValue());

            } else if (num1 instanceof Float || num2 instanceof Float) {
                return (Result) Float.valueOf(num1.floatValue() * num2.floatValue());

            } else if (num1 instanceof Long || num2 instanceof Long) {
                return (Result) Long.valueOf(num1.longValue() * num2.longValue());

            } else {
                return (Result) Integer.valueOf(num1.intValue() * num2.intValue());

            }

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
        
    }

    public <Result extends Number> Result getMin() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (Result) Double.valueOf(Math.min(num1.doubleValue(), num2.doubleValue()));

        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (Result) Float.valueOf(Math.min(num1.floatValue(), num2.floatValue()));

        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (Result) Long.valueOf(Math.min(num1.longValue(), num2.longValue()));

        } else {
            return (Result) Integer.valueOf(Math.min(num1.intValue(), num2.intValue()));

        }
    }

    public <Result extends Number> Result getMax() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (Result) Double.valueOf(Math.max(num1.doubleValue(), num2.doubleValue()));

        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (Result) Float.valueOf(Math.max(num1.floatValue(), num2.floatValue()));

        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (Result) Long.valueOf(Math.max(num1.longValue(), num2.longValue()));

        } else {
            return (Result) Integer.valueOf(Math.max(num1.intValue(), num2.intValue()));

        }
    }


    
}
