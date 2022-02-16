/*
    #78 Subsets:
    Given an integer array nums of unique elements, return all possible subsets (the power set).
    The solution set must not contain duplicate subsets. Return the solution in any order.
 */

import java.util.*;
public class Subsets {
    public static void main(String[] args) {
        int[] n = {0, 1};
        //System.out.println(subsets(n));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> l = new ArrayList<List<Integer>>();
        l.add(new ArrayList<Integer>());
        System.out.println(l);
        return l;
    }
}
