class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        int n = a + b + c;
        int A = 0, B = 0, C = 0;
        for (int i = 0; i < n; i++) {
            if ((a >= b && a >= c && A != 2) || (B == 2 && a >= c && a > 0) || (C == 2 && a >= b && a > 0)) {
                sb.append('a');
                a--;
                A++;
                B = 0;
                C = 0;
            } else if ((b >= a && b >= c && B != 2) || (A == 2 && b >= c && b > 0) || (C == 2 && b >= a && b > 0)) {
                sb.append('b');
                b--;
                B++;
                A = 0;
                C = 0;
            } else if ((c >= a && c >= b && C != 2) || (A == 2 && c >= b && c > 0) || (B == 2 && c >= a && c > 0)) {
                sb.append('c');
                c--;
                C++;
                A = 0;
                B = 0;
            }
        }
        return sb.toString();
    }
}
