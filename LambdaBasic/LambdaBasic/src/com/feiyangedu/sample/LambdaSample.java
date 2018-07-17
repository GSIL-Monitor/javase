package com.feiyangedu.sample;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaSample {

	public static void main(String[] args) throws Exception {
		String[] words = "Improving code with Lambda expressions in Java".split(" ");
		Arrays.sort(words, (s1, s2) -> {
			// 忽略大小写排序:
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		});
		System.out.println(Arrays.toString(words));
	}
}