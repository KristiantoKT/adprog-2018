package applicant;

public class CreditEvaluator extends EvaluatorChain {

    public CreditEvaluator(Evaluator next) {
        super(next);
    }

    public boolean evaluate(Applicant applicant) {
        if (applicant.getCreditScore() > 600) {
            return super.evaluate(applicant);
        }

        return false;
    }
}