public class Evaluator {

    private ExpressionTokenizer tokenizer;

    public Evaluator(String expression){
        tokenizer = new ExpressionTokenizer(expression);
    }

    public int getFactorValue(){
        int value = 0;
        var nextToken = tokenizer.peekToken();
        if("(".equals(nextToken)){
            tokenizer.nextToken(); // Discard "("
            //Recursive call
            value = getExpressionValue();
            tokenizer.nextToken(); // Discard ")"
        }
        else{
            value = Integer.parseInt(tokenizer.nextToken());
        }
        return value;
    }

    public int getTermValue(){
        int value = getFactorValue();
        boolean done = false;
        while(!done){
            String nextToken = tokenizer.peekToken();
            if("*".equals(nextToken) || "/".equals(nextToken)){
                tokenizer.nextToken();
                int value2 = getFactorValue();
                if("*".equals(nextToken)){
                    value = value * value2;
                }
                else{
                    value = value / value2;
                }
            }
            else {
                done = true;
            }
        }
        return value;
    }

    public int getExpressionValue(){
        int value = getTermValue();
        boolean done = false;
        while(!done){
            String nextToken = tokenizer.peekToken();
            if("+".equals(nextToken) || "-".equals(nextToken)){
                tokenizer.nextToken();
                int value2 = getTermValue();
                if("+".equals(nextToken)){
                    value = value += value2;
                }
                else{
                    value = value -= value2;
                }
            }
            else {
                done = true;
            }
        }
        return value;
    }

}
