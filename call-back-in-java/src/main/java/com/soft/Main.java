package com.soft;

import com.soft.ds.Pair;
import com.soft.evaluator.AddEvaluator;
import com.soft.evaluator.MultiplyEvaluator;
import com.soft.render.FormalRender;
import com.soft.render.VerboseRender;
import com.soft.service.EvaluatorService;

public class Main {
    public static void main(String[] args) {
        EvaluatorService evaluatorService = new EvaluatorService();
        evaluatorService.takeAction(
                new MultiplyEvaluator(), //a->a.get(A)*a.get(B),
                new FormalRender(),      //a->System.out.println(a);
                new Pair(5,7)
        );
    }
}
