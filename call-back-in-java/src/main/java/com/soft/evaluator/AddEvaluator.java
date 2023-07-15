package com.soft.evaluator;

import com.soft.ds.Pair;

public class AddEvaluator implements Evaluator{
    @Override
    public int evaluate(Pair pair) {
        return pair.getB()+ pair.getA();
    }
}
