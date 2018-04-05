package applicant;

public class EmploymentEvaluator extends EvaluatorChain {

    public EmploymentEvaluator(Evaluator next) {
        super(next);
    }

    public boolean evaluate(Applicant applicant) {
        if (applicant.getEmploymentYears() > 0) {
            return super.evaluate(applicant);
        }

        return false;
    }
}
