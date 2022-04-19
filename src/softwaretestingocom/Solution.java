package softwaretestingocom;

public class Solution {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.solution("?ab??a"));
    }
    public String solution(String riddle) {
        char alpha[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        if (riddle == null || riddle.indexOf('?') == -1) {
            return "NO";
        }
        StringBuilder sb = new StringBuilder("");
        int cnt = 0;
        for (int i = 0; i < riddle.length(); i++) {
            char current = riddle.charAt(i);
            char prev = '\0';
            char next = '\0';
            if (current == '?') {
                current = alpha[cnt];
                if (i != 0) {
                    prev = sb.toString().charAt(i - 1);
                }
                if (i != riddle.length() - 1) {
                    next = riddle.charAt(i + 1);
                }
                while (current == prev || current == next) {
                    current = alpha[++cnt];
                    if (cnt % 25 == 0) {
                        cnt = 0;
                    }
                }
                sb.append(current);
            } else {
                sb.append(current);
            }
        }
        return sb.toString();
    }
}