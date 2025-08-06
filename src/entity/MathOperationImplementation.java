package abstraction.src.entity;

import abstraction.src.interfaces.MathOperation;

public class MathOperationImplementation implements MathOperation {


    @Override
    public int operate(int a, int b) {
        return a+b;
    }
}
