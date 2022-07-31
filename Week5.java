////import java.util.Arrays;
////
////public class Week5 {
////    public int numWays(String[] words, String target) {
////        int[][] indexCharCount = new int[words[0].length()][26];
////        int[][] dp = new int[words[0].length()][target.length()];
////        for (int[] ar : dp)
////            Arrays.fill(ar, -1);
////        for (String word : words) {
////            for (int i = 0; i < word.length(); i++)
////                indexCharCount[i][word.charAt(i) - 'a']++;
////        }
////
////        return waysHelper(indexCharCount, 0, target, 0, dp);
////    }
////
////    private int waysHelper (int[][] indexCharCount, int wordIndex, String target, int targetIndex, int[][] dp) {
////        long count = 0;
////        if (targetIndex == target.length())
////            return 1;
////        if (wordIndex == indexCharCount.length)
////            return 0;
////
////        if (dp[wordIndex][targetIndex] != -1)
////            return dp[wordIndex][targetIndex];
////
////        for (int i = wordIndex; i < indexCharCount.length; i++) {
////            if (indexCharCount[i][target.charAt(targetIndex) - 'a'] > 0)
////                count += indexCharCount[i][target.charAt(targetIndex) - 'a'] * (long)waysHelper(indexCharCount, i+1, target, targetIndex+1, dp);
////            count = count % 1000000007;
////        }
////
////        return dp[wordIndex][targetIndex] = (int)count;
////
////    }
////
////    public static void main(String[] args) {
////        Week5 obj = new Week5();
////        String A[] = {"programming","for","developers"};
////        System.out.println(obj.numWays(A, "frog"));
////        ;
////    }
////}
//public class Week5 {
//    // funtion to
//    public static void checkSubset(String target, String[] set) {
//        String visited = "";
//
//        int ans = 0;
//
//        for (int i = 0; i < target.length(); i++) {
//            for (int j = 0; j < set.length; j++) {
//                for (int k = 0; k < set[j].length(); k++) {
//                    if (target.toUpperCase().charAt(i) == set[j].toUpperCase().charAt(k)
//                            && !visited.contains(target.charAt(i) + "")) {
//                        visited += target.charAt(i);
//
//                        if (ans <= j + 1) {
//                            ans++;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(ans);
//    }
//
//    public static void main(String[] args) {
//        String target = "frog";
//        String[] set = { "programming","for","developers"};
//        checkSubset(target, set);
//    }
//}



public class Week5 {

    public static int checkSubset(String target, String[] set) {
        String visited = "";

        int ans = 0;

        for (int i = 0; i < target.length(); i++) {
            for (int j = 0; j < set.length; j++) {
                for (int k = 0; k < set[j].length(); k++) {
                    if (target.toUpperCase().charAt(i) == set[j].toUpperCase().charAt(k)
                            && !visited.contains(target.charAt(i) + "")) {
                        visited += target.charAt(i);

                        if (ans <= j + 1) {
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String target = "frog";
        String[] set = { "programming","for","developers"};
        System.out.println(checkSubset(target, set));
    }
}

