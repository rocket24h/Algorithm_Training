public class canConstructTab {
    public static void main(String args[]) {
        System.out.println(canConstructFunc("abcdef", new String[] { "ab", "abc", "cd", "def", "abcd" })); // true
        System.out.println(canConstructFunc("skateboard", new String[] { "bo", "rd", "ate", "t", "ska", "sk", "boar" })); // false
        System.out.println(canConstructFunc("enterapotentpot", new String[] { "a", "p", "ent", "enter", "ot", "o", "t" })); // true
    }

    public static boolean canConstructFunc(String target, String[] wordBank) {
        boolean[] arr = new boolean[target.length() + 1];
        arr[0] = true;
        for (int i = 0; i < target.length() + 1; i++) {
            if (arr[i] == true) {
                for (String word : wordBank) {
                    if (i + word.length() <= target.length()) {
                        String suffix = target.substring(i, i + word.length());
                        if (suffix.equals(word))
                            arr[i + word.length()] = true;
                    }
                }
            }
        }
        return arr[target.length()];
    }
    
}
