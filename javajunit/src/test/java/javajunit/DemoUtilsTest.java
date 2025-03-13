package javajunit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class DemoUtilsTest {

	DemoUtils d;
	@BeforeClass
	public static void setUpClass() {
		System.out.println("set upClass() called");
	}
	@Before
	public void setUp() {
		System.out.println("set up() called");
		d = new DemoUtils();
	}

	@Test
	public void testAdd() {
		System.out.println("add()");
		assertEquals(4, d.add(2, 2));
	}

	@Test
	public void testMul() {
		System.out.println("mul()");
		assertEquals(100, d.mul(10, 10));
	}
	
	@Test
	public void testIsEven() {
		System.out.println("isEven()");
//		assertTrue(d.isEven(9));
		assertFalse(d.isEven(9));
	}
	
	@Test
	public void testGetMessage() {
		System.out.println("getmsg()");
		assertNull(d.getMessage());
	}
	
	@Test
	public void testGetNumbers() {
		System.out.println("getnum()");
		int []arr = {1,2,3,4};
		assertArrayEquals(arr,d.getNumbers());
	}
	
	@Test(expected=ArithmeticException.class)
	public void testThrowException() {
		System.out.println("throwException()");
		
		d.throwException();
	}
	
	@After
	public void tearDown() {
		System.out.println("teardown() called");
		d = null;
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("teardownClass() called");

	}
}
