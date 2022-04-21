package com.binde.spring;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestBean implements Test {

	private Set<String> list;

	public void setList(Set<String> list) {
		this.list = list;
	}

	public void display() {
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			String name = i.next();
			System.out.println(name);
		}
		System.out.println("Using To String Method use");
		System.out.println(list);
	}
}
