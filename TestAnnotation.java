package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class TestAnnotation {
	@Test
	public void f() {

		System.out.println("within test");
	}

	@Test
	public void f1() {

		System.out.println("within test");
	}

	@BeforeTest
	public void befreanytest() {
		System.out.println("Before all test");
	}

	@AfterTest
	public void afterAllTest() {
		System.out.println("After all test");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before every method");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("After every method");
	}

	@BeforeClass
	public void Beforeanyclass() {
		System.out.println("Beforeanyclass");
	}

	@AfterClass
	public void afteranyclass() {
		System.out.println("afteranyclass");
	}

}
