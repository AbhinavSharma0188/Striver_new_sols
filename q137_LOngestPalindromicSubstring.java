class Solution {
    public String longestPalindrome(String s) {

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++){

            int left = i;
            int right = i;
            char c = s.charAt(i);

            while(left >= 0 && s.charAt(left) == c){
                left--;
            }

            while(right < s.length() && s.charAt(right) == c){
                right++;
            }

            while(left >= 0 && right < s.length()){
                if(s.charAt(left) != s.charAt(right)){
                    break;
                }
                left--;
                right++;
            }

            left++;
            right--;

            if(end - start < right - left + 1){
                start = left;
                end = right;
            }
        }

        return s.substring(start, end + 1);
    }
}