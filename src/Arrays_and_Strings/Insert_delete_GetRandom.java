package Arrays_and_Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Insert_delete_GetRandom {

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(2);
        boolean param_2 = obj.remove(2);
        int param_3 = obj.getRandom();
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
    }

    static class RandomizedSet {
        private HashSet<Integer> set;
        private Random rand;

    public RandomizedSet() {
        set = new HashSet<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if ( set.contains(val)) {
            return false;
        } else {
            set.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        } else {
            return false;
        }
    }
    
    public int getRandom() {
        ArrayList<Integer> list = new ArrayList<>(set);
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
