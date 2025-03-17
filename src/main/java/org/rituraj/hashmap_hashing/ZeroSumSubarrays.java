package org.rituraj.hashmap_hashing;

import java.util.*;

public class ZeroSumSubarrays {
    public static List<List<Integer>> findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                result.add(Arrays.asList(0, i));
            }
            if (map.containsKey(sum)) {
                for (int index : map.get(sum)) {
                    result.add(Arrays.asList(index + 1, i));
                }
                map.get(sum).add(i);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(sum, temp);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6, -2, -2, -2};
        List<List<Integer>> result = findZeroSumSubarrays(arr);
        for (List<Integer> subarray : result) {
            System.out.println("Subarray from index " + subarray.get(0) + " to " + subarray.get(1));
        }
    }
}
