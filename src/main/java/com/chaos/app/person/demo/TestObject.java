package com.chaos.app.person.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 重写equals，重写hashcode的注意事项
 * 
 * @author LiuChao
 *
 */
public class TestObject {
	private int num;

	private String data;

	public TestObject() {
		// TODO Auto-generated constructor stub
	}

	public TestObject(int num, String data) {
		this.num = num;
		this.data = data;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		return super.equals(obj);

		if (this == obj) {
			return true;
		}

		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		TestObject objTemp = (TestObject) obj;
		return num == objTemp.num && (data == objTemp.data || (data != null == data.equals(objTemp.data)));
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return super.hashCode();

		int hash = 7;
		hash = 31 * hash + num;
		hash = 31 * hash + data.hashCode();
		return hash;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public static void main(String[] args) {
		String a = "1bczssssssssssssssssssssssssssssss";
		System.out.println(a.hashCode() + "|" + a.getClass());

		// 20190327 hashcode equals 重写
		TestObject b = new TestObject(1, "liuchao");
		TestObject c = new TestObject(1, "liuchao");

		// 1、不重写equals hashcode，得false false
		// 2、重写 equals，不重写hashcode，得true
		// false。这就是为什么要在重写equals的同时重写hashcode的原因，hashcode有个一致的约定，当equals返回true的时候，两个对象的hashcode返回值应当相等。
		// 3、重写equals hashcode，得true true
		System.out.println(b.equals(c));
		System.out.println(b.hashCode() == c.hashCode());

		// hashmap
		// 设计hashCode()时最重要的因素就是：无论何时，对同一个对象调用hashCode()都应该产生同样的值。如果在讲一个对象用put()添加进HashMap时产生一个hashCdoe值，而用get()取出时却产生了另一个hashCode值，那么就无法获取该对象了。
		// 所以如果你的hashCode方法依赖于对象中易变的数据，用户就要当心了，因为此数据发生变化时，hashCode()方法就会生成一个不同的散列码
		Map<TestObject, Integer> map = new HashMap<>();
		TestObject d = new TestObject(1, "liuchao");
		map.put(d, 888);

		d.setNum(2);

		// 这里若重写hashcode，当setNum(2)时，hashcode会改变，此时map.get(d)寻找的key是d的hashcode，所以取了空值。若不重写hashcode，setNum(2)不影响hashcode的返回值，则map.get(d)仍会取到888
		System.out.println(map.get(d));
	}
}
