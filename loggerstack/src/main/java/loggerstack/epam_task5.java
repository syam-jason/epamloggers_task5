package loggerstack;

import static org.junit.Assert.*;

import org.junit.Test;

public class epam_task5 {

	@Test
	public void test() {
		simpleandcompound S=new simpleandcompound();

		assertEquals(500.0,S.CompoundInterest(5, 1, 10000, "Annually"),0);
	}

}
