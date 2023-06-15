import java.util.HashMap;

public class Tester {
    public static String longestCommonPrefix(String[] vals) {
        char curr;
        boolean diffFound = false;
        int i = 0;

        while (!diffFound) {
            if (i >= vals[0].length()) {
                i++;
                break;
            }
            curr = vals[0].charAt(i);
            for (String val : vals) {
                if (i >= val.length() || val.charAt(i) != curr) {
                    diffFound = true;
                    break;
                }
            }
            i++;
        }

        if (i == 1) {
            return "-1";
        }

        return vals[0].substring(0, i - 1);
    }
}
