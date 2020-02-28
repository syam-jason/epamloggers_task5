package loggerstack;

import static org.junit.Assert.*;

import org.junit.Test;

public class testintrest {

	@Test
	public void test() {
		simpleandcompound S=new simpleandcompound();

		assertEquals(500.0,S.simpleInterest(5, 1, 10000),0);
	}

}
