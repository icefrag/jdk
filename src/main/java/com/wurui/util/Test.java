package com.wurui.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		System.out.println(new Date(0));
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list = list.stream().filter(i -> i > 2).collect(Collectors.toList());
		list.forEach(i -> System.out.println(i));
	}
	public static double add(double value1, double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.add(b2).doubleValue();

	}
}
