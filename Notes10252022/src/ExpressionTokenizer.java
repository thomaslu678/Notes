public class ExpressionTokenizer {

    private String input;
    private int start;
    private int end;

    public ExpressionTokenizer(String input){
        this.input = input;
        this.start = 0;
        this.end = 0;
    }

    public String peekToken(){
        if (start >= input.length()) {
            return null;
        }
        return input.substring(start, end);
    }

    public String nextToken(){
        String value = peekToken();
        start = end;
        if(start >= input.length()){
            return value;
        }
        if(Character.isDigit(input.charAt(start))){
            end = start + 1;
            while(end < input.length() && Character.isDigit(input.charAt(end))){
                end++;
            }
        }
        else{
            end = start + 1;
        }
        return value;
    }


}
