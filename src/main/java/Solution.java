class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() -1;
        while (!Character.isLetter(s.charAt(i))) i--;
        while (i >= 0 && Character.isLetter(s.charAt(i))) {
            i--;
            length++;
        }
        return length;
    }
}