public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder res = new StringBuilder();
        int len = s.length();

        for (int r = 0; r < numRows; r++) {
            int increment = 2 * (numRows - 1);
            for (int i = r; i < len; i += increment) {
                res.append(s.charAt(i));
                if (r > 0 && r < numRows - 1 && i + increment - 2 * r < len) {
                    res.append(s.charAt(i + increment - 2 * r));
                }
            }
        }

        return res.toString();
    }
}