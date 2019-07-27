package com.chaos.app.person.demo;

public class Daughter extends Person{
	public void print() {
		System.out.println("The daughter's name is " + super.getName() + ", age is " + super.getAge());
	}
	
	public void cry() {
		System.out.println("She is cring.");
	}
	
	public static void main(String[] args) {
		Person a = new Daughter();
		a.getName();
		//a.cry(); // 对象a的this是Person类，这个类型的指针并不能指向cry()这个方法！
	}
}
