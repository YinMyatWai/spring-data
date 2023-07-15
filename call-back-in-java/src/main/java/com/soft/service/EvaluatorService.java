package com.soft.service;

import com.soft.ds.Pair;
import com.soft.evaluator.Evaluator;
import com.soft.render.RenderExpression;

public class EvaluatorService {

    public void takeAction(Evaluator evaluator, RenderExpression render, Pair pair){
        render.display(evaluator.evaluate(pair));
    }
}
