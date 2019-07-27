package com.chaos.app.person.demo;

public class Son extends Person {
	private String school;

	public Son() {

	}

	public Son(String name, int age, String school) {
		super(name, age);
		this.school = school;
		System.out.println("Son constuction");
	}

	@Override
	public void print() {
		System.out.println(
				"The son's name is " + this.getName() + ", age is " + this.getAge() + ", school is " + this.school);
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	// 编译报错，不能将父类被覆写的方法的访问权限扩大
//	private void print() {
//		
//	}

	public static void main(String[] args) {
		Person a = new Person("Liuchao", 28);
		Son b = new Son("xiao", 8, "Peking U");
		Person c = new Son("hehe", 9, "Ts U");
		
//		//多态
//		c = new Daughter();

		a.print();
		b.print();
		c.print();
	}
}
