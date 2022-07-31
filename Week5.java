
public class Week5 {

    public static int subsetCheck(String target, String[] set) {
        String visit = "";

        int ans = 0;

        for (int i = 0; i < target.length(); i++) {
            for (int j = 0; j < set.length; j++) {
                for (int k = 0; k < set[j].length(); k++) {
                    if (target.toUpperCase().charAt(i) == set[j].toUpperCase().charAt(k)
                            && !visit.contains(target.charAt(i) + "")) {
                        visit += target.charAt(i);

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
        System.out.println(subsetCheck(target, set));
    }
}

