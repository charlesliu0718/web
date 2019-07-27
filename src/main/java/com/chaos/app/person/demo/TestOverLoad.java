package com.chaos.app.person.demo;

public class TestOverLoad {
	public static void print(String args) {
		System.out.println("String is "+ args);
	}
	
	public static void print(Integer args) {
		System.out.println("Integer is "+ args);
	}
	
	public static void main(String[] args) {
		print("a");
		print(7);
		
//		// null可以匹配任何对象，会造成二义性，不知道是调用第一个还是第二个方法。
//		print(null);
	}
}
