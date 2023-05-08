package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution_39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(result, candidates, new ArrayList<>(), 0, target, 0);
        return result;
    }
    public void backtracking(List<List<Integer>> result, int[] candidates, List<Integer> path, int sum, int target, int startIndex){

        if (sum == target){
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++){
            path.add(candidates[i]);
            sum += candidates[i];
            backtracking(result, candidates, path, sum, target, i);
            path.remove(path.size() - 1);
            sum -= candidates[i];
        }
    }
}