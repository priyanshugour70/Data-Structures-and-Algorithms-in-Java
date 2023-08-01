public class p7_OperatorExample {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 3;

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;

        // Logical Operators
        boolean x = true;
        boolean y = false;

        boolean andResult = x && y;
        boolean orResult = x || y;
        boolean notX = !x;

        // Relational Operators
        int p = 5;
        int q = 7;

        boolean isEqual = p == q;
        boolean isNotEqual = p != q;
        boolean isGreater = p > q;
        boolean isLess = p < q;
        boolean isGreaterOrEqual = p >= q;
        boolean isLessOrEqual = p <= q;

        // Bitwise Operators
        int m = 5;
        int n = 3;

        int bitwiseAnd = m & n;
        int bitwiseOr = m | n;
        int bitwiseXor = m ^ n;
        int bitwiseComplementM = ~m;
        int leftShift = m << 2;
        int rightShift = m >> 1;

        // Assignment Operators
        int xValue = 10;
        int yValue = 5;

        xValue += yValue;
        xValue -= yValue;
        xValue *= yValue;
        xValue /= yValue;
        xValue %= yValue;

        // Conditional (Ternary) Operator
        int number = 15;
        String result = (number > 10) ? "Greater than 10" : "Less than or equal to 10";

        // Printing the results
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        System.out.println("\nLogical Operators:");
        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);
        System.out.println("NOT X: " + notX);

        System.out.println("\nRelational Operators:");
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Less: " + isLess);
        System.out.println("Is Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Is Less or Equal: " + isLessOrEqual);

        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise Complement of M: " + bitwiseComplementM);
        System.out.println("Left Shift of M: " + leftShift);
        System.out.println("Right Shift of M: " + rightShift);

        System.out.println("\nAssignment Operators:");
        System.out.println("xValue: " + xValue);

        System.out.println("\nConditional Operator:");
        System.out.println("Result: " + result);
    }
}
