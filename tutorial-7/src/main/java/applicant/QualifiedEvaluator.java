package applicant;

public class QualifiedEvaluator implements Evaluator {

    public boolean evaluate(Applicant applicant) {
        return applicant.isCredible();
    }
}
