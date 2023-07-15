package com.soft.evaluator;

import com.soft.ds.Pair;

public class MultiplyEvaluator implements Evaluator{
    @Override
    public int evaluate(Pair pair) {
        return pair.getA()* pair.getB();
    }
}
