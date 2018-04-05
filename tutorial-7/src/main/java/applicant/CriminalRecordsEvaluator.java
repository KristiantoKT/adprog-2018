package applicant;

public class CriminalRecordsEvaluator extends EvaluatorChain {

    public CriminalRecordsEvaluator(Evaluator next) {
        super(next);
    }

    public boolean evaluate(Applicant applicant) {
        if (!applicant.hasCriminalRecord()) {
            return super.evaluate(applicant);
        }

        return false;
    }
}
