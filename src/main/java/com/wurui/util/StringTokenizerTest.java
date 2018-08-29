package com.wurui.util;

import java.util.StringTokenizer;

/**
 * string的分词器目前已不推荐使用
 * @author Administrator
 *
 */
public class StringTokenizerTest {
	public static void main(String[] args) {
	     StringTokenizer st = new StringTokenizer("this is a test");
	     while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }
	}
}
