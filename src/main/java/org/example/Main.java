package org.example;

import leetcode.Solution_39;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution_39 solution39 = new Solution_39();
        int[] candidates = new int[]{2,3,6,7};
        List<List<Integer>> result = solution39.combinationSum(candidates,7);

        System.out.println(result);

    }
}