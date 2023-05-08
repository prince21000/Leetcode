package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_17 {
    List<String> results = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {

        if(digits == null || digits.length() == 0){
            return results;
        }
        backtracking(digits, 0);
        return results;
    }

    public void backtracking(String digits, int index){
        if(index == digits.length()){
            results.add(sb.toString());
            return;
        }

        String letter = letters[digits.charAt(index) - '0'];
        for(int i = 0; i<letter.length(); i++){
            sb.append(letter.charAt(i));
            backtracking(digits, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}