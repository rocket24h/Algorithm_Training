import java.util.*;

public class canConstruct {
    public static void main(String args[]){
        HashMap<String, Boolean> memo = new HashMap<>();
        System.out.println(canConstructFunc("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}, memo));
        System.out.println(canConstructFunc("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"}, memo));
        System.out.println(canConstructFunc("enterapotentpot", new String[] {"a", "p", "ent", "enter", "ot", "o", "t"}, memo));
        System.out.println(canConstructFunc("eeeeeeeeeeeeeeeeeeeeeeef", new String[] {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}, memo));

    }

    public static boolean canConstructFunc(String target, String[] wordBank, HashMap<String, Boolean> memo){
        if(memo.containsKey(target))
            return memo.get(target);
        if(target.equals(""))
            return true;
        
        for(String word: wordBank){
            if(target.indexOf(word) == 0){
                String suffix = target.substring(word.length());
                if(canConstructFunc(suffix, wordBank, memo)){
                    memo.put(target, true);
                    return true;
                }
            }
        }
        memo.put(target, false);
        return false;
    }

    
}
