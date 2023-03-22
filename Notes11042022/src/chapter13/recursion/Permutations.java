package chapter13.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public List<String> permute(String word){

        List<String> result = new ArrayList<>();

        // Terminating condition
        // Empty string
        if(word.length() == 0){
            result.add(word);
            return result;
        }
        else{
            for(int i = 0; i < word.length(); i++){
                String shorterString = word.substring(0, i) + word.substring(i + 1);
                List<String> shorterPermutation = permute(shorterString);
                for(var s : shorterPermutation) {
                    result.add(word.charAt(i) + s);
                }
            }
        }

        return result;
    }

}
