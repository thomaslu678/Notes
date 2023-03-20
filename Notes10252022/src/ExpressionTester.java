public class ExpressionTester {

    public static void main(String[] args) {

        String expression = "(5+4)*2/3";
        Evaluator evaluator = new Evaluator(expression);
        int answer = evaluator.getExpressionValue();
        System.out.println("answer: " + answer);

    }

}
