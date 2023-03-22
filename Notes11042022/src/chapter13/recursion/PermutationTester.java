package chapter13.recursion;

public class PermutationTester {

    public static void main(String[] args) {

        Permutations permute = new Permutations();
        for (String s : permute.permute("eat")){
            System.out.println(s);
        }

    }

}
