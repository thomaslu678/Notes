package chapter13.backtracing;

public class EightQueens {

    public static void main(String[] args) {



    }

    public static void solve(PartialSolution solution){
        int test  = solution.examine();
        if(test == PartialSolution.ACCEPT){
            System.out.println(solution);
        }
        else if (test == PartialSolution.CONTINUE){
            for(PartialSolution p : solution.extend()){
                solve(p);
            }
        }
    }


}
