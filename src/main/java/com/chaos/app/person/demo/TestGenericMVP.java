package com.chaos.app.person.demo;

import java.util.logging.Logger;


public class TestGenericMVP<T> {
	// 这里的第一个String并不是真的String
	@SuppressWarnings("hiding")
	public static <String, T, Liuchao> String get(String string, Liuchao liuchao) {
		// 类型擦除，故不能相加；泛型只是起到一个在编译期的检查作用 CHECKCAST
		System.out.println(string+"|"+liuchao);
		return string;
	}
	
	private static final Logger logger = Logger.getLogger("TestGenericMVP");
	
	public static void main(String[] args) {
		Integer first = 71;
		Long second = 71L;
		Integer third = 71;
		
		//third换成81后，==则返回false
		
		Integer result = get(first, second);
		System.out.println(result);
		
		// -128~127之间才会缓存，此时使用==是返回true，超过这个范围，使用==是比较的对象的引用，所以包装类推荐使用equals
		System.out.println(first.equals(third));
		System.out.println(first==third);
		
		//logger日志
		logger.info("hi guys");
		
		
	}
}
