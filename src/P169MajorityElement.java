import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class P169MajorityElement {

    public int majorityElement(int[] nums) { //it works, but its slow.
        //nums has size n, return the majority element
        //can assume it exists, and it appears more than n/2 times
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
