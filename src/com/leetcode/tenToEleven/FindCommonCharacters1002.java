package com.leetcode.tenToEleven;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuLiHao on 2020/1/7 0007 上午 11:25
 * @author : LiuLiHao
 * 描述：
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 *
 * 你可以按任意顺序返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：["bella","label","roller"]
 * 输出：["e","l","l"]
 * 示例 2：
 *
 * 输入：["cool","lock","cook"]
 * 输出：["c","o"]
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] 是小写字母
 *
 */
public class FindCommonCharacters1002 {

    public static void main(String[] args) {
        String[] strs = {
                "cool","lock","cook"
        };

        System.out.println(commonChars(strs));
    }
    public static List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        int[] mapping = new int[26];
        //统计第一个字符字母
        for (char c : A[0].toCharArray()) {
            mapping[ c - 'a'] ++;
        }

        for (int i = 1; i < A.length; i++) {
            int[] temp = new int[26];
            for (char c : A[i].toCharArray()) {
                temp[c - 'a']++;
            }
            //交集
            for (int j = 0; j < 26; j++) {
                mapping[j] = Math.min(mapping[j],temp[j]);
            }
        }

        //取结果
        for (int i = 0; i < mapping.length; i++) {
            if (mapping[i]>0){
                for (int j = 0; j < mapping[i]; j++) {
                    result.add( (char)('a'+i) +"" );
                }
            }
        }

        return result;
    }
}
