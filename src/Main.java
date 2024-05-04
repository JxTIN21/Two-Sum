import java.util.HashMap;
import java.util.Map;

//Given an array of integers numbs and an integer target, return indices of the two numbers such that they add up to target.
//   You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
public class Main {
    public static int[] twoSum(int[] numbs, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbs.length; i++) {
            int curr = numbs[i];
            int x = target - curr;
            if (map.containsKey(x)) {
                return new int[] {map.get(x), i};
            }
            map.put(curr, i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] numbs = {3, 6, 9, 4, 2};
        int target = 11;
        int[] result = twoSum(numbs, target);
        assert result != null;
        System.out.println(result[0] + "," + result[1]);
    }
}