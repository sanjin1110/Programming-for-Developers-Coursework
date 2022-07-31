import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Week6 {
    public boolean canSolve(String[] words, String output) {
        Map<Character, Integer> letterDigitMap = new HashMap<Character, Integer>();
        Set<Character> leadingSet = new HashSet<Character>();
        int resultLength = output.length();
        for (String word : words) {
            if (word.length() > resultLength)
                return false;
            if (word.length() > 1)
                leadingSet.add(word.charAt(0));
        }
        if (output.length() > 1)
            leadingSet.add(output.charAt(0));
        boolean[] used = new boolean[10];
        int[] carry = new int[resultLength + 1];
        return DFS(words, output, letterDigitMap, leadingSet, used, carry, 0, 0);
    }

    public boolean DFS(String[] words, String output, Map<Character, Integer> letterDigitMap, Set<Character> leadingSet, boolean[] used, int[] carry, int position, int wordIndex) {
        if (position == output.length())
            return carry[position] == 0;
        else if (wordIndex < words.length) {
            String word = words[wordIndex];
            int wordLength = word.length();
            if (wordLength <= position || letterDigitMap.containsKey(word.charAt(wordLength - position - 1)))
                return DFS(words, output, letterDigitMap, leadingSet, used, carry, position, wordIndex + 1);
            else {
                char letter = word.charAt(wordLength - position - 1);
                int start = leadingSet.contains(letter) ? 1 : 0;
                for (int i = start; i <= 9; i++) {
                    if (!used[i]) {
                        used[i] = true;
                        letterDigitMap.put(letter, i);
                        boolean next = DFS(words, output, letterDigitMap, leadingSet, used, carry, position, wordIndex + 1);
                        used[i] = false;
                        letterDigitMap.remove(letter);
                        if (next)
                            return true;
                    }
                }
            }
            return false;
        } else {
            int remain = carry[position];
            for (String word : words) {
                if (word.length() > position) {
                    char letter = word.charAt(word.length() - position - 1);
                    remain += letterDigitMap.get(letter);
                }
            }
            carry[position + 1] = remain / 10;
            remain %= 10;
            char letter = output.charAt(output.length() - position - 1);
            if (letterDigitMap.containsKey(letter) && letterDigitMap.get(letter) == remain)
                return DFS(words, output, letterDigitMap, leadingSet, used, carry, position + 1, 0);
            else if (!letterDigitMap.containsKey(letter) && !used[remain] && !(leadingSet.contains(letter) && remain == 0)) {
                used[remain] = true;
                letterDigitMap.put(letter, remain);
                boolean next = DFS(words, output, letterDigitMap, leadingSet, used, carry, position + 1, 0);
                used[remain] = false;
                letterDigitMap.remove(letter);
                return next;
            } else
                return false;
        }
    }
    public static void main(String[] args) {
    	String word[] = new String[] {"THIS","IS","TOO"};
    	String result = "FUNNY";
    	Week6 obj = new Week6();
    	System.out.println(obj.canSolve(word, result));
    }
}