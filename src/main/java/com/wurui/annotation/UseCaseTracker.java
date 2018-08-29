package com.wurui.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTracker {
	public static void trackUseCases(Class<?> cl) {
		for (Method m : cl.getDeclaredMethods()) {
			System.out.println(m.getName());
			UseCase uc = m.getAnnotation(UseCase.class);
			if (uc != null) {
				System.out.println(uc.id() + "," + uc.desc());
			}
		}
	}

	public static void main(String[] args) {
	    List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 10);
		trackUseCases(Test.class);
    }
}
