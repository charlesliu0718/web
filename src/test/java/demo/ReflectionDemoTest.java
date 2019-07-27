package demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.chaos.app.person.demo.ReflectionDemo;

public class ReflectionDemoTest {
	@Test
	public void printClassMethod1() {
		new ReflectionDemo().printClassMethod();
		assertEquals(true, true);
	}
}
