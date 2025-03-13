package javajunit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamTest {
	
		private int x;
		private int y;
		private int res;
		DemoUtils d;
		
		public ParamTest(int x,int y,int res) {
			super();
			this.x=x;
			this.y=y;
			this.res = res;
		}
		
		@Parameters
		public static Collection myResults() {
			return Arrays.asList(new Object [][] {{5,5,10},{2,3,5},{4,4,8},{5,5,10}});
		}
		@Test
		public void testAddition() {
			System.out.println("Add()");
			assertEquals(res,d.addition(x,y));
		}
		@Before
		public void setUp() {
			System.out.println("set up() called");
			d = new DemoUtils();
			}
		
		@After
		public void tearDown() {
			System.out.println("tearDown() called");
			d=null;
		}
	
}
