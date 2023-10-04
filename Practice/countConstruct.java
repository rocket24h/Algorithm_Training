import java.util.*;

public class countConstruct {
    public static void main(String args[]) {
        HashMap<String, Integer> memo = new HashMap<>();
        System.out.println(countConstructFunc("purple", new String[] { "purp", "p", "ur", "le", "purpl" }, memo)); // 2
        System.out.println(countConstructFunc("abcdef", new String[] { "ab", "abc", "cd", "def", "abcd"}, memo)); // true
        System.out.println(countConstructFunc("skateboard", new String[] { "bo", "rd", "ate", "t", "ska", "sk", "boar" }, memo)); // false
        System.out.println(countConstructFunc("enterapotentpot", new String[] { "a", "p", "ent", "enter", "ot", "o", "t" }, memo)); // true
        System.out.println(countConstructFunc("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[] { "e", "ee", "eee", "eeee", "eeeee", "eeeeee" }, memo)); // false
    }

    public static int countConstructFunc(String target, String[] wordBank, HashMap<String, Integer> memo) {
        if (memo.containsKey(target))
            return memo.get(target);
        if (target.equals(""))
            return 1;
        int totalCount = 0;
        for (String word : wordBank) {
            if (target.indexOf(word) == 0) {
                String suffix = target.substring(word.length());
                int numWaysForRest = countConstructFunc(suffix, wordBank, memo);
                totalCount += numWaysForRest;
            }
        }
        memo.put(target, totalCount);
        return totalCount;
    }
    
}
