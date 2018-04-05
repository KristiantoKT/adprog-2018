package applicant;

public class EvaluatorChain implements Evaluator {
    private Evaluator next;

    public EvaluatorChain(Evaluator nextEvaluator) {
        next = nextEvaluator;
    }

    public boolean evaluate(Applicant applicant) {
        return next.evaluate(applicant);
    }
}