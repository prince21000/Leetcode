package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_236 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(n, 0, k, 1);
        return result;
    }
    public void backtracking(int targetSum, int sum, int k, int startIndex){

        if(path.size() == k){
            if(sum == targetSum){
                result.add(new ArrayList<>(path));
            }
            return;
        }

        for(int i = startIndex; i<= 9; i++){
            sum += i;
            path.add(i);
            backtracking(targetSum, sum, k, i+1);
            sum -= i;
            path.removeLast();
        }
    }
}
