package webdriver1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Executed After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Executed Before");

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Executed After");

	}

	@Test
	public void test() {
		System.out.println("Executed Test");

	}
	@Test
	public void test1() {
		System.out.println("Executed Test1");

	}


}
