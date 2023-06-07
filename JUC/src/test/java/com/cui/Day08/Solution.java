package com.cui.Day08;

public class Solution {
    public int lengthLongestPath(String input) {
        int[] str = new int[input.length() + 1];
        String[] split = input.split("\n");
        //深度

        int res= 0;
        for (String s : split) {
            int length = 0;
            for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i)=='\t'){
                        length++;
                    }
            }
            //减去层级加上/
            str[length+1] = s.length()+str[length]-length+1;
            if(s.contains(".")){
                res = Math.max(res, str[length + 1]-1);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext");
        System.out.println(i);
    }
}
