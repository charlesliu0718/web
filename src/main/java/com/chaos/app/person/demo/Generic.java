package com.chaos.app.person.demo;

public class Generic<T> {
	private T key;

	public Generic(T key) {
		this.key = key;
	}

	// 这样写是可以的
	public void showkey(T key) {
		System.out.println("The key is " + key);
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}
}
