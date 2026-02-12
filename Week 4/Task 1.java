class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                if (i < mid) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        return count == 0;
    }


    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}