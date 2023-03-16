package chapter13;

public class Sentence {

    public boolean isPalindrome(){
        return isPalindrome(0, text.length() - 1);
    }


    private boolean isPalindrome(int start, int end){
        if(start >= end){
            return true;
        }

    char first = Character.toLowerCase(text.charAt(start));
    char last = Character.toLowerCase(text.charAt(end));

    if(Character.isLetter(first) && Character.isLetter(last)){
        if(first == last){
            return isPalindrome(start + 1, end - 1);
        }
        else {
            return false;
        }
    }
    else if (!Character.isLetter(first)){
        return isPalindrome(start + 1, end);
    }
    else {
        return isPalindrome(start, end - 1);
    }

}
