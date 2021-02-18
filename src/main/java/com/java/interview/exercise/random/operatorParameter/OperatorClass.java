package com.java.interview.exercise.random.operatorParameter;

public class OperatorClass {
    public static void main(String[] args) {
        int num1 = 91;
        int num2 = 9;
        String operator = "Multiply";
        int total = getTotal(num1, num2, operator);
        System.out.println(total);
    }

    private static int getTotal(int num1, int num2, String operator) {

        if (operator.equalsIgnoreCase(Operators.ADD.toString())) {
            System.out.println(Operators.ADD.toString());
            Operators op = Operators.ADD;
            return op.makeOperation(num1, num2);
        } else if (operator.equalsIgnoreCase(Operators.MULTIPLY.toString())) {
            Operators op = Operators.MULTIPLY;
            return op.makeOperation(num1, num2);
        }
        if (operator.equalsIgnoreCase(Operators.SUBTRACT.toString())) {
            Operators op = Operators.SUBTRACT;
            return op.makeOperation(num1, num2);
        }
        if (operator.equalsIgnoreCase(Operators.DIVIDED.toString())) {
            Operators op = Operators.DIVIDED;
            op.makeOperation(num1, num2);
        }
        return 0;
    }
}
