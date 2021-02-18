package com.java.interview.exercise.random.operatorParameter;

public enum Operators {

    ADD {
        @Override
        public int makeOperation(int num, int num2) {
            return num + num2;
        }
    },
    SUBTRACT {
        @Override
        public int makeOperation(int num, int num2) {
            return num - num2;
        }
    },
    MULTIPLY {
        @Override
        public int makeOperation(int num, int num2) {
            return num * num2;
        }
    },
    DIVIDED {
        @Override
        public int makeOperation(int num, int num2) {
            if (num2 != 0) {
                return num / num2;
            }
            return 0;
        }
    };

    public abstract int makeOperation(int num, int num2);
}
