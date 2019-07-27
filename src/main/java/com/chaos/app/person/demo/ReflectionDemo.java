package com.chaos.app.person.demo;

import java.lang.reflect.Method;

public class ReflectionDemo {
	public void printClassMethod() {
		String classname = "java.lang.String";
		
		try {
			Class<?> c = Class.forName(classname);
			
			Method[] m = c.getDeclaredMethods();
			
			for(int i = 0; i < m.length;i++) {
				System.out.println(m[i].toString());
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
