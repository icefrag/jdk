package com.wurui.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @description: 无重复字符的最长子串
 * @author: wurui
 * @create: 2018-10-19 18:16
 **/
public class Solution1 {
//    示例 1:
//
//    输入: "abcabcbb"
//    输出: 3
//    解释: 无重复字符的最长子串是 "abc"，其长度为 3。
//    示例 2:
//
//    输入: "bbbbb"
//    输出: 1
//    解释: 无重复字符的最长子串是 "b"，其长度为 1。
//    示例 3:
//
//    输入: "pwwkew"
//    输出: 3
//    解释: 无重复字符的最长子串是 "wke"，其长度为 3。
//    请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int i = 0;
        int j = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while (i < length && j < length){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max = Math.max(max,set.size());
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        int length = s.length();
        int i = 0;
        int j = 0;
        int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        while (i < length && j < length){
            if (map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);
            }
            map.put(s.charAt(j),j+1);
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }

    public static void main(String[] args){
        Solution1 s = new Solution1();
        System.out.println(s.lengthOfLongestSubstring2("abcdbbefghai"));
    }
}
