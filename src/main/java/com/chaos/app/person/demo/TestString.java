package com.chaos.app.person.demo;

public class TestString {
	/**
	 * 创建了三个对象，"helloworld对象创建在常量池中"，每次new String()都会创建一个对象在堆内存中工两个堆对象。
	 * 
	 */
	void test() {
		String s1 = new String("helloworld");
		String s2 = new String("helloworld");
		System.out.println(s1 + s2);
	}

	/**
	 * 程序只创建一个字符串对象“Java”，存放在常量池中，所以s1==s2 为true
	 * 
	 */
	void test1() {
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 == s2);
	}

	/**
	 * 第一个new String("Java"):创建了两个对象，Java创建于常量池中，String对象创建于堆内存中。 第二个new
	 * String("Java"):由于常量池中有Java对象，所以只需创建一个对象，String对象创建于堆内存中。
	 * s1与s2分别指向String对象堆内存，所以s1==s2 为false
	 */
	void test2() {
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1 == s2);
	}

	/**
	 * 常量的值在编译的时候就确定了，"hello"、"world"都是常量，因此s2的值在编译的时候也确定了， s2指向常量池中的"hello
	 * world",所以s1==s2为true
	 * 
	 */
	void test3() {
		String s1 = "hello world";
		String s2 = "hello " + "world";
		System.out.println(s1 == s2);
	}

	/**
	 * s4由两个String变量相加得到，不能再编译时就确定下来，不能直接引用常量池中的"helloworld"对象，而是在堆内存中创建一个新的String对象并由s4指向
	 * 所以s1==s4为false
	 * 
	 */
	void test4() {
		String s1 = "helloworld";
		String s2 = "hello";
		String s3 = "world";
		String s4 = s2 + s3;
		System.out.println(s1 == s4);
	}

	/**
	 * s2与s3被final修饰为宏变量，不可更改，编译器在程序使用该变量的地方直接使用该变量的值进行替代，所以s4的值在编译的时候就为"helloworld"
	 * 指向常量池中的"helloworld"对象 所以s1==s4为true
	 * 
	 */
	void test5() {
		String s1 = "helloworld";
		final String s2 = "hello";
		final String s3 = "world";
		String s4 = s2 + s3;
		System.out.println(s1 == s4);
	}

	public static void main(String[] args) {
		TestString o = new TestString();
		o.test1();
		o.test2();
		o.test3();
		o.test4();
		o.test5();

	}
}
