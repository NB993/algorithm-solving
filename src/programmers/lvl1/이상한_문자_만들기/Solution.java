package programmers.lvl1.이상한_문자_만들기;

public class Solution {
    public static String solution(String s) {
        String[] words = s.split(" ");

        String ans = "";

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (j % 2 == 0) {
                    ans += Character.toUpperCase(words[i].charAt(j));
                } else {
                    ans += Character.toLowerCase(words[i].charAt(j));
                }
            }
            ans += " ";
        }
        return ans.substring(0, ans.length() - 1);

    }

    public static void main(String[] args) {
        String str = solution("try  hello world");
        System.out.println(str);
    }
}
