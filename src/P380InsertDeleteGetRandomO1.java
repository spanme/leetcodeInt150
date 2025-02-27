import java.util.*;

public class P380InsertDeleteGetRandomO1 {
    class RandomizedSet {

        private final List<Integer> list;
        private final Map<Integer, Integer> map;
        private final Random random;

        public RandomizedSet() {
            list = new ArrayList<>();
            map = new HashMap<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            }
            map.put(val, list.size());
            list.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) {
                return false;
            }
            int lastElement = list.getLast();
            int indexToRemove = map.get(val);

            list.set(indexToRemove, lastElement);
            map.put(lastElement, indexToRemove);

            list.removeLast();
            map.remove(val);

            return true;
        }

        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
    }
    //this must happen in O(1) time.

}
